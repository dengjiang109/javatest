<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/27 0027
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>登录界面</title>
    <base href="<%=basePath %>" />
</head>
<body>

<div align="center">
    <p>登录，密码默认333</p>
    <form action="register.do" method="post">
        <tr>
            <td>姓名</td>
            <td> <input type="text" name="name"></td>

        </tr>

        <tr>
            <td>密码</td>
            <td> <input type="text" name="pass"></td>

        </tr>

        <tr>
            <td>&nbsp;</td>
            <td> <input type="submit" value="登录"></td>

        </tr>



    </form>

</div>



</body>
</html>
