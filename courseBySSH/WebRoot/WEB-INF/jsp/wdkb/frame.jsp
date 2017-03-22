<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
application.setAttribute("basePath",basePath);
pageContext.setAttribute("ctx", request.getContextPath()) ;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>教务系统-我的课表</title>
    <link href="${ctx}/css/nsfw/css.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/css/nsfw/style.css" rel="stylesheet" type="text/css" />
</head>
<frameset cols="*,1222,*" class="bj" frameborder="no" border="0" framespacing="0">
    <frame src="${ctx}/common/bg.jsp" scrolling="No" noresize="noresize"/>
    <frameset rows="156,*" cols="*" frameborder="no" border="0" framespacing="0">
        <frame src="${ctx }/wdkb/top.action" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" />
        <frame src="${ctx }/wdkb/kb.action" id="bottomFrame" scrolling="yes" noresize="noresize" id="bottomFrame" />
    </frameset>
    <frame src="${ctx}/common/bg.jsp" scrolling="No" noresize="noresize"/>
</frameset>
<body>
<br/>
</body>
</html>