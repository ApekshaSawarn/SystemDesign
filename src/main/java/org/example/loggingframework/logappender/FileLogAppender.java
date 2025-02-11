package org.example.loggingframework.logappender;

import org.example.loggingframework.LogMessage;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogAppender implements LogAppender{
    private final String filePath;
    public FileLogAppender(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public void append(LogMessage logMessage) {
        try(FileWriter fileWriter = new FileWriter(filePath,true)) {
            fileWriter.write(logMessage.toString()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
