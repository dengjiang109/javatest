<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/27 0027
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>错误界面1</title>
    <base href="<%=basePath %>" />
</head>
<body>
<p>请输入你的名字</p>
<a href="index.jsp">后退</a>

</body>
</html>
