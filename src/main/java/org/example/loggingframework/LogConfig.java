package org.example.loggingframework;

import org.example.loggingframework.logappender.LogAppender;

public class LogConfig {
    private LogLevel logLevel;
    private LogAppender logAppender;
    public LogConfig(LogLevel logLevel, LogAppender logAppender) {
        this.logLevel = logLevel;
        this.logAppender = logAppender;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogAppender(LogAppender logAppender) {
        this.logAppender = logAppender;
    }

    public LogAppender getLogAppender() {
        return logAppender;
    }
}
