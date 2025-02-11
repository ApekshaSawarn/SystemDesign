package org.example.loggingframework;

import org.example.loggingframework.logappender.ConsoleLogAppender;

public class Logger {
    private static final Logger instance = new Logger();
    private LogConfig logConfig;
    private Logger() {
        logConfig = new LogConfig(LogLevel.INFO, new ConsoleLogAppender());
    }
    public static Logger getInstance() {
        return instance;
    }
    public void setConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    private void log(LogLevel logLevel, String message) {
        if(logLevel.ordinal()>=this.logConfig.getLogLevel().ordinal()) {
            LogMessage logMessage = new LogMessage(logLevel,message);
            this.logConfig.getLogAppender().append(logMessage);
        }
    }

    public void debug(String message) {
        log(LogLevel.DEBUG,message);
    }

    public void info(String message) {
        log(LogLevel.INFO,message);
    }

    public void warning(String message) {
        log(LogLevel.WARNING,message);
    }

    public void error(String message) {
        log(LogLevel.ERROR,message);
    }

    public void fatal(String message) {
        log(LogLevel.FATAL,message);
    }
}
