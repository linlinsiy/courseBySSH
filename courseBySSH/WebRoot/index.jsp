<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
  </head>
  
  <body>
    <form action="student/save.action" method="post">
  	stuName:<input type="text" name="stuName"><br>
  	stuPwd:<input type="text" name="stuPwd"><br>
  	<input type="submit" value="add">
  	</form><hr>
  </body>
</html>
