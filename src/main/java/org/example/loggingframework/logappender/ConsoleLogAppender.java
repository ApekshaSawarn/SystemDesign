package org.example.loggingframework.logappender;

import org.example.loggingframework.LogMessage;

public class ConsoleLogAppender implements  LogAppender{
    @Override
    public void append(LogMessage logMessage) {
        System.out.println(logMessage.toString());
    }
}
