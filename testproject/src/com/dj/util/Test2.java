package com.dj.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
    public static void main(String[] args) throws SQLException {
       Connection connection= JDBCUtils.getConnection();
        Statement stmt = (Statement) connection.createStatement();
       String sql;

       sql = "insert into tbl_test(name,brithday,sex,remarks,tel,occupation) values ('登记',2000-12-13,'男','程序员',13230314097,'没有')";
       int f=stmt.executeUpdate(sql);




    }
}
