package HW12;

public class Main {
    public static void main(String[] args) {
        FileLoggerConfiguration cfg = new FileLoggerConfigurationLoader().load("src/HW12/logger.conf");

        Logger logger = new FileLogger(cfg, true);   // можно подменить на StdoutLogger

        logger.info("test log");     // код ниже не знает, какой это логгер
        logger.debug("debug message");
    }
}
