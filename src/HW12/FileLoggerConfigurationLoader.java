package HW12;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileLoggerConfigurationLoader implements LoggerConfigurationLoader<FileLoggerConfiguration> {

    @Override
    public FileLoggerConfiguration load(String path) {
        Map<String, String> values = new HashMap<>();
        try {
            for (String line : Files.readAllLines(Path.of(path))) {
                int idx = line.indexOf(':');
                if (idx < 0) continue;
                values.put(line.substring(0, idx).trim().toUpperCase(),
                        line.substring(idx + 1).trim());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read config: " + path, e);
        }

        return new FileLoggerConfiguration(
                values.get("FILE"),
                LoggingLevel.valueOf(values.get("LEVEL").toUpperCase()),
                Long.parseLong(values.get("MAX-SIZE")),
                values.get("FORMAT"));
    }
}
