package com.dj.controller;

import com.dj.domain.User;
import com.dj.util.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "register")
public class register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println("====================================");
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        String nam1=null;

        String sql="select name from tbl_test where name='"+name+"'";
        Connection connection=JDBCUtils.getConnection();
        Statement statement=null;
        try {
             statement=connection.createStatement();
           ResultSet resultSet= statement.executeQuery(sql);
           while (resultSet.next()){
                nam1=resultSet.getString("name");
           }
           System.out.println(nam1);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        if (nam1!=null && "333".equals(pass)){
            User user=new User();
            user.setName(nam1);
            request.getSession().setAttribute("user",user);

            response.getWriter().print("<a href=/test/backstage.jsp>退出</a>");
        }else {
            response.sendRedirect("error3.jsp");

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
