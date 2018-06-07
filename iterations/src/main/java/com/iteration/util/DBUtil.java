package com.iteration.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {

    private static final String dbUrl = "jdbc:mysql://%s:3306/%s?useUnicode=true&characterEncoding=utf8";
    private static final String dbHost = "localhost";
    private static final String dbName = "sakila";
    private static final String dbUserName = "root";
    private static final String dbPassword = "abc123_";

    public static Connection getConnection() {
        Connection conn = null;

        // 1. load mysql driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }

        // 2. prepare the connection url
        String jdbcUrl = String.format(dbUrl, dbHost, dbName);

        // 3. get connection
        try {
            conn = DriverManager.getConnection(jdbcUrl, dbUserName, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException();
        }

        return conn;
    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public static void setAutoCommit(Connection conn, boolean isAutoCommit) {
        try {
            conn.setAutoCommit(isAutoCommit);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public static void commit(Connection conn) {
        try {
            conn.commit();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public static void rollback(Connection conn) {
        try {
            conn.rollback();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}