package org.example.loggingframework;

import org.example.loggingframework.logappender.ConsoleLogAppender;
import org.example.loggingframework.logappender.FileLogAppender;

public class Main {
    public static void main(String args[]) {
        Logger logger = Logger.getInstance();
        logger.info("This is an information message");
        logger.warning("This is a warning message");
        logger.error("This is an error message");
        logger.debug("DEBUG");//This will not be printed since ordinal(index) of debug is less than info which is the default log level that is initialized.
        // Changing log level and appender
        LogConfig config = new LogConfig(LogLevel.DEBUG, new ConsoleLogAppender());
        logger.setConfig(config);

        logger.debug("This is a debug message");
        logger.info("This is an information message");
    }
}
