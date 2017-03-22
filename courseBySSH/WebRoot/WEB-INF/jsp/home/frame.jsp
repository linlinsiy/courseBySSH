<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    pageContext.setAttribute("ctx", request.getContextPath()) ;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>教务系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${ctx}/css/home.css" rel="stylesheet" type="text/css" />

</head>
<frameset cols="*,1222,*" class="bj" frameborder="no" border="0" framespacing="0">
  <frame src="${ctx}/common/bg.jsp" scrolling="No" noresize="noresize"/>
  <frameset rows="156,*" cols="*" frameborder="no" border="0" framespacing="0">
        <frame src="${ctx }/wdkb/top.action" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" />
        <frame src="${ctx }/home/home.action" name="bottomFrame" scrolling="yes" noresize="noresize" id="bottomFrame"/>
    </frameset>
  <frame src="${ctx}/common/bg.jsp" scrolling="No" noresize="noresize"/>
</frameset>
  <body>
    <br/>
  </body>
</html>
