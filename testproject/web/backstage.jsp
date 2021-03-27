<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/27 0027
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>欢迎来到后台</title>
    <base href="<%=basePath %>" />

    <script type="text/javascript" src="jquery/jquery-3.6.0.slim.min.js"></script>
    <script type="text/javascript">


    </script>



</head>
<body>
<div align="center">
    <p>查询所有用户</p>

    <form action="backstage.do" method="get">
        <tr>
            <td>输入你要查的人的名字</td>
            <td><input type="text" name="name"></td>

        </tr>

        <tr>
            <td>输入你要查的人的性别</td>
            <td><input type="text" name="sex"></td>

        </tr>

        <tr>
            <td>输入你要查的人的出生日期</td>
            <td><input type="text" name="brithday"></td>

        </tr>

        <tr>

            <td><input id="b" type="button" value="查询"></td>

        </tr>



    </form>




</div>

</body>
</html>
