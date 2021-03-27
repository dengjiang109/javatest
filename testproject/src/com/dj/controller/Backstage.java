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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Backstage")
public class Backstage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name =request.getParameter("name");
        String sex=request.getParameter("sex");
        String brithday=request.getParameter("brithday");
        Connection connection= JDBCUtils.getConnection();
        Statement statement=null;
        if (name!=null){

            try {
                statement = connection.createStatement();
                String sql="select * from tbl_test where name='"+name+"'";
               ResultSet resultSet= statement.executeQuery(sql);
                List<User> userlist=new ArrayList();

               while(resultSet.next()){
                   String name1=resultSet.getString("name");
                   String sex1=resultSet.getString("sex");
                   String brithday1=resultSet.getString("brithday");
                   String remarks=resultSet.getString("remarks");
                   String tel=resultSet.getString("tel");
                   String occupation=resultSet.getString("occupation");
                   User user=new User();
                   user.setName(name1);
                   user.setRemarks(remarks);
                   user.setTel(tel);
                   user.setOccupation(occupation);
                   user.setBrithday(brithday1);
                   user.setSex(sex1);
                   userlist.add(user);
               }


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



            if (sex!=null){
                ResultSet resultSet=null;
                try {
                    statement = connection.createStatement();
                    String sql="select * from tbl_test where sex='"+sex+"'";
                    resultSet= statement.executeQuery(sql);
                    List<User> userlist=new ArrayList();

                    while(resultSet.next()){
                        String name1=resultSet.getString("name");
                        String sex1=resultSet.getString("sex");
                        String brithday1=resultSet.getString("brithday");
                        String remarks=resultSet.getString("remarks");
                        String tel=resultSet.getString("tel");
                        String occupation=resultSet.getString("occupation");
                        User user=new User();
                        user.setName(name1);
                        user.setRemarks(remarks);
                        user.setTel(tel);
                        user.setOccupation(occupation);
                        user.setBrithday(brithday1);
                        user.setSex(sex1);
                        userlist.add(user);
                    }


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


            }

            if (brithday!=null){
                ResultSet resultSet=null;
                try {
                    statement = connection.createStatement();
                    String sql="select * from tbl_test where brithday='"+brithday+"'";
                    resultSet= statement.executeQuery(sql);
                    List<User> userlist=new ArrayList();

                    while(resultSet.next()){
                        String name1=resultSet.getString("name");
                        String sex1=resultSet.getString("sex");
                        String brithday1=resultSet.getString("brithday");
                        String remarks=resultSet.getString("remarks");
                        String tel=resultSet.getString("tel");
                        String occupation=resultSet.getString("occupation");
                        User user=new User();
                        user.setName(name1);
                        user.setRemarks(remarks);
                        user.setTel(tel);
                        user.setOccupation(occupation);
                        user.setBrithday(brithday1);
                        user.setSex(sex1);
                        userlist.add(user);
                    }


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

            }
            if (name!=null &&sex!=null){

                ResultSet resultSet=null;
                try {
                    statement = connection.createStatement();
                    String sql="select * from tbl_test where name='"+name+"' and sex='"+sex+"'";
                    resultSet= statement.executeQuery(sql);
                    List<User> userlist=new ArrayList();

                    while(resultSet.next()){
                        String name1=resultSet.getString("name");
                        String sex1=resultSet.getString("sex");
                        String brithday1=resultSet.getString("brithday");
                        String remarks=resultSet.getString("remarks");
                        String tel=resultSet.getString("tel");
                        String occupation=resultSet.getString("occupation");
                        User user=new User();
                        user.setName(name1);
                        user.setRemarks(remarks);
                        user.setTel(tel);
                        user.setOccupation(occupation);
                        user.setBrithday(brithday1);
                        user.setSex(sex1);
                        userlist.add(user);
                    }


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










            }




            }

        }






    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
