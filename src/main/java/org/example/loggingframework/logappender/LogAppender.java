package org.example.loggingframework.logappender;

import org.example.loggingframework.LogMessage;

public interface LogAppender {
    public void append(LogMessage logMessage);
}
