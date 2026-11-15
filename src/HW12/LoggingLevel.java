package HW12;

public enum LoggingLevel {
    INFO, DEBUG; // порядок важен: чем выше ordinal, тем «подробнее»

    /** Будет ли сообщение этого уровня записано при настроенном уровне configured */
    public boolean isVisibleAt(LoggingLevel configured) {
        return this.ordinal() <= configured.ordinal();
    }
}
