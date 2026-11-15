package HW12;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
    private static final DateTimeFormatter TIME_FMT =
            DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter FILE_FMT =
            DateTimeFormatter.ofPattern("dd.MM.yyyy-HH-mm-ss-SSS"); //

    private final FileLoggerConfiguration config;
    private final boolean rotate;
    private Path currentFile;

    public FileLogger(FileLoggerConfiguration config, boolean rotate) {
        this.config = config;
        this.rotate = rotate;
        this.currentFile = Path.of(config.getFile());
    }

    @Override public void debug(String message) { log(LoggingLevel.DEBUG, message); }
    @Override public void info(String message)  { log(LoggingLevel.INFO, message); }

    private void log(LoggingLevel level, String message) {
        if (!level.isVisibleAt(config.getLevel())) return;

        String line = config.getFormat()
                .replace("{time}", LocalDateTime.now().format(TIME_FMT))
                .replace("{level}", level.name())
                .replace("{message}", message)
                + System.lineSeparator();

        try {
            if (currentFile.getParent() != null) {
                Files.createDirectories(currentFile.getParent());
            }
            long size = Files.exists(currentFile) ? Files.size(currentFile) : 0;

            if (size >= config.getMaxSize()) {            // «достигнут или превышен»
                if (!rotate) {
                    throw new FileMaxSizeReachedException(
                            config.getMaxSize(), size, currentFile.toAbsolutePath().toString());
                }
                currentFile = createNextFile();
            }

            Files.writeString(currentFile, line, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private Path createNextFile() {
        String name = "Log_" + LocalDateTime.now().format(FILE_FMT) + ".txt";
        Path parent = currentFile.getParent();
        return parent == null ? Path.of(name) : parent.resolve(name);
    }
}
