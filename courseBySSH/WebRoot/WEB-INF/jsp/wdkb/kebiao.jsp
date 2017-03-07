<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'kebiao.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    			<div class="search_art">
                    <li style="float:right;">
                        <input type="button" value="导出课表" class="s_button" onclick="doExportExcel()"/>&nbsp;
                    </li>
                </div>
                <div class="t_list" style="margin:1px; border:1px;">
                    <table width="100%" border="0">
                        <tr class="t_tit" bgcolor="#b5b5b5">
                            <td width="160" align="center">节次</td>
                            <td width="140" align="center">周一</td>
                            <td width="140" align="center">周二</td>
                            <td width="140" align="center">周三</td>
                            <td width="140" align="center">周四</td>
                            <td width="140" align="center">周五</td>                            
                            <td width="140" align="center">周六</td>
                            <td width="140" align="center">周日</td>
                        </tr>
                        <c:forEach var="i" begin="0" end="12">
                        <tr <c:if test="${i%2==0 }"> bgcolor="#f0f0f0" </c:if> height="50px" >
                                <td align="center">${sessionScope.time[i] }</td>
                                <c:forEach var="j" begin="0" end="4">
                                <td align="center">${sessionScope.lessonTable[j][i].lesName }</td>
                                </c:forEach>
                                <td><td>
                         </tr>
                         </c:forEach>
                    </table>
                </div>
  </body>
</html>
