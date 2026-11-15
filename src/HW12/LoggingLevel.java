package HW12;

public enum LoggingLevel {
    INFO, DEBUG;

    public boolean isVisibleAt(LoggingLevel configured) {
        return this.ordinal() <= configured.ordinal();
    }
}
