package com.dj;


import com.dj.util.JDBCUtils;

import java.sql.*;

public class test {
    // JDBC 驱动名及数据库 URL

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    static final String user="root";
    static final String password="333";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("连接数据库...");
            conn = (Connection) DriverManager.getConnection(DB_URL,user,password);
            stmt = (Statement) conn.createStatement();
            String sql;
            sql = "insert into tbl_test(name) value ('小白')";
           int a= stmt.executeUpdate(sql);
           System.out.println(a);







        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("关闭异常");
                    e.printStackTrace();
                }
            }

            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("Goodbye!");


    }
}
