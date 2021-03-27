package com.dj.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.ResourceBundle;
public class JDBCUtils {

    private static String driver;//Ctrl+Alt+F抽取全局静态变量
    private static String url;
    private static String username;
    private static String password;

    /*读取属性文件，获取jdbc信息*/
    static{
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        driver = bundle.getString("driver");
        url = bundle.getString("url");
        username = bundle.getString("username");
        password = bundle.getString("password");
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {

            Class.forName(driver);

            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static void release(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {

        if(resultSet!=null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(preparedStatement!=null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    }







