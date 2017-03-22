﻿<%@ page contentType="text/html; charset=UTF-8"%>
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

<body>

<!-- 左{ -->
<div class="content">
    <div class="left">
        <!-- 个人资料{ -->
        <div class="left_grzx1">
            <div class="left_grzxbt">
                <h1>个人资料</h1>
                <div style="float:right;padding-top:3px;">
                	<a href="${ctx }/student/editUI.action" target="bottomFrame">编辑</a>&nbsp;&nbsp;
                </div>
            </div>
            <table width="98%" border="0" align="center">
                <tr>
                    <td width="76" height="100" align="center" valign="middle">
                        <div class="left-tx">
                        <c:choose>
                            <c:when test="${!empty SYS_STUDENT.stuPic }">
                            	<img src="${ctx}/upload/student/${SYS_STUDENT.stuPic }.png" width="70" height="70" />
                            </c:when><c:otherwise>
								<img src="${ctx}/images/home/gs09.png" width="70" height="70" />
                        	</c:otherwise>
                        </c:choose>
                        </div>
                    </td>
                    <td width="5%"><img src="${ctx}/images/home/gs10.png" width="4" height="59" alt="" /></td>
                    <td width="60%"><table width="95%" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td colspan="2" style=" font-weight:bold; color:#3a7daa;">${SYS_STUDENT.stuName }</td>
                        </tr>
                        <tr>
                            <td colspan="2">班级：${SYS_STUDENT.stuClass }</td>
                        </tr>
                    </table>
                    </td>
                </tr>
            </table>
        </div>
        <!-- }个人资料 -->
    </div>
<!-- }左 -->

    <!-- 右{ -->
    <div class="right">
        <div class="left_grzx1">
            <div class="left_grzxbt">
                <h1>信息列表</h1>
            </div>
            <table width="98%" border="0" align="center">
            	
                <tr>
                    <td height="23">
                    xx标题
                    </td>
                    <td width="150px">xx分类</td>
                    <td width="150px">xx创建人</td>
                    <td width="150px">xx创建时间</td>
                </tr>
                
            </table>
        </div>
    </div>
    <!-- }右-->
    <div class="clear"></div>

    <div class="layout_center">
        <div class="lc_grzx1">
            <div class="lc_grzxbt">
                <h1>当前课程</h1>
            </div>
            <table width="98%" border="0" align="center">
                
                <tr>
                    <td height="23">
                   	 课程名
                    </td>
                    <td width="180px">上课时间</td>
                    <td width="180px">上课教室</td>
                    <td width="180px">教师名</td>
                    <%-- <c:forEach items="" var="">
                    
                    </c:forEach> --%>
                </tr>
                
            </table>
        </div>

        <div class="lc_grzx1">
            <div class="lc_grzxbt">
                <h1>我的咨询</h1>
            </div>
            <table width="98%" border="0" align="center">
                <tr>
                    <td></td>
                    <td width="150px"></td>
                    <td width="150px"></td>
                </tr>
            </table>
        </div>
    </div>
</div>
<!-- 尾部{ -->
<div class="foot">版权所有©国税局 2014</div>
<!-- }尾部 -->
</body>
</html>