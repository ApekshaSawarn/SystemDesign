package org.example.loggingframework.logappender;

import org.example.loggingframework.LogMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseLogAppender implements LogAppender{
    private final String jdbcUrl;
    private final String user;
    private final String password;

    public DatabaseLogAppender(String jdbcUrl, String user, String password) {
        this.jdbcUrl = jdbcUrl;
        this.user = user;
        this.password = password;
    }

    @Override
    public void append(LogMessage logMessage) {
        try(Connection connection = DriverManager.getConnection(jdbcUrl,user,password);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO logs (level,message,timestamp) VALUES (?,?,?)")
        ){
            statement.setString(1,jdbcUrl);
            statement.setString(2,user);
            statement.setString(3,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
