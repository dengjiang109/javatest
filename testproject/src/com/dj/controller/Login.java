package com.dj.controller;

import com.dj.domain.User;
import com.dj.util.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "Servlet")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println("欢迎进入这个系统");
        String name=request.getParameter("name");
        System.out.println(name);
        String brithday=request.getParameter("brithday");

        if (brithday.length()!=10){
            response.sendRedirect("error.jsp");
        }




        String sex=request.getParameter("sex");
        String remarks=request.getParameter("remarks");
        String tel=request.getParameter("tel");
        String occupation=request.getParameter("occupation");


        String sql="insert into tbl_test(name,brithday,sex,remarks,tel,occupation) ";
        String a="values( ";
        String b="'"+name+"',"+brithday+",'"+sex+"',"+remarks+","+tel+","+occupation+")";
        String c= sql.concat(a).concat(b);
        System.out.println(c);

        Connection connection= null;
        Statement stmt = null;
        try {
            connection=JDBCUtils.getConnection();
            stmt = (Statement) connection.createStatement();
//            sql = "insert into tbl_test(name) values ('小白')";
            int f=stmt.executeUpdate(c);
            System.out.println(f);
            connection.close();
            stmt.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }




        User user=new User();
        user.setName(name);
        user.setBrithday(brithday);
        user.setOccupation(occupation);
        user.setSex(sex);
        user.setTel(tel);
        user.setRemarks(remarks);
        System.out.println(user);






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
