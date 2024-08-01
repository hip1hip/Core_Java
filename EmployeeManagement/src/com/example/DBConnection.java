/*
    작성자: 성기범, 신동진, 홍인표
    작성일: 2024-08-01
    작성목적: JDBC 실기 시험문제
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
            MySQL 8.0
 */
package com.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private Properties info;

    public DBConnection() {

        this.info = new Properties();
        File file = new File("D:\\Workspace\\group task 3\\dbinfo.properties");

        try {
            this.info.load(new FileInputStream(file));

        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

    public Connection getConnection() {

        Connection conn = null;

        try {
            Class.forName(this.info.getProperty("DBDRIVER")); //2. Driver Loading

            conn = DriverManager.getConnection(this.info.getProperty("DBURL"),
                    this.info.getProperty("DBUSER"),
                    this.info.getProperty("DBPASSWD"));
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

}
