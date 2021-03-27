
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

  <head>
    <title>欢迎使用此系统</title>
    <base href="<%=basePath %>" />
  </head>
  <body>

  <div align="center">

    <p>注册</p>
    <form action="login.do" method="post">
      <table>
        <tr>
          <td>姓名</td>
          <td> <input type="text" name="name"></td>
        </tr>

        <tr>
          <td>生日</td>
          <td> <input type="text" name="brithday"></td>
        </tr>

        <tr>
          <td>性别</td>
          <td> <input type="text" name="sex"></td>
        </tr>

        <tr>
          <td>职业</td>
          <td> <input type="text" name="occupation"></td>
        </tr>

        <tr>
          <td>电话号码</td>
          <td> <input type="text" name="tel"></td>
        </tr>

        <tr>
          <td>备注</td>
          <td> <input type="text" name="remarks"></td>

        </tr>

        <tr>
          <td>&nbsp;</td>
          <td> <input type="submit" value="注册"></td>

        </tr>

      </table>

      <p></p>
      <a href="register.jsp">进入登录界面</a>
     </form>





  </div>



  </body>
</html>
