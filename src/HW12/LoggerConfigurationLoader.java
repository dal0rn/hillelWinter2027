package HW12;

public interface LoggerConfigurationLoader<T extends LoggerConfiguration> {
    T load(String source);
}
