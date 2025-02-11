package org.example.loggingframework;

public class LogMessage {
    private final LogLevel logLevel;
    private final String message;
    private final long timestamp;
    LogMessage(LogLevel logLevel, String message) {
        this.logLevel = logLevel;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + logLevel + "] " + timestamp + " - " + message;
    }
}
