<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML >
<html>
  <head>
  	<%@include file="/common/header.jsp"%>    
    <title>我的资料</title>
    <script type="text/javascript" src="${basePath }js/datepicker/WdatePicker.js"></script>
	<script type="text/javascript">
	//提交表单
	function doSubmit(){
		//用户名不能为空
		var $stuName = $("#stuName");
		if($stuName.val() == ""){
			alert("用户名不能为空");
			$stuName.focus();
			return false;
		}
		//密码不为空
		var $stuPwd = $("#stuPwd");
		if($stuPwd.val() == ""){
			alert("密码不能为空");
			$stuPwd.focus();
			return false;
		}
			document.forms[0].submit();
	}
	</script>

  </head>
  
  <body class="rightBody">
    <form id="form" name="form" action="edit.action" method="post"  enctype="multipart/form-data">
    	<div class="p_d_1">
        <div class="p_d_1_1">
            <div class="content_info">
    	<div class="c_crumbs"><div><b></b><strong>个人资料</strong>&nbsp;-&nbsp;编辑用户</div></div>
    	<div class="tableH2">编辑用户</div>
    	<table id="baseInfo" width="100%" align="center" class="list" border="0" cellpadding="0" cellspacing="0">
    		<tr>
    			<td class="tdBg" width="200px">班级：</td>
            	<td><select name="stuClass ">
            		<option value="1班" <c:if test="${SYS_STUDENT.stuClass }='1班'">selected="selected"</c:if> >1班</option>
            		<option value="2班" <c:if test="${SYS_STUDENT.stuClass }='2班'">selected="selected"</c:if> >2班</option>
            	</select></td>
    		</tr>
    	<tr>
    			<td class="tdBg" width="200px">头像：</td>
    			<td>
    			<c:if test="${!empty SYS_STUDENT.stuPic }">
    				<img src="${basePath}upload/student/${SYS_STUDENT.stuPic }.png" width="70" height="70" />
    				<input type="hidden" name="stuPic">
    			</c:if>
    			<input type="file" name="headImg"/>
    			</td>
    		</tr>

    		<tr>
            	<td class="tdBg" width="200px">姓名：</td>
            	<td><input type="text" name="stuName" value="${SYS_STUDENT.stuName }"/></td>
        	</tr>
        	<tr>
	            <td class="tdBg" width="200px">密码：</td>
	            <td><input type="password" name="stuPwd" value="${SYS_STUDENT.stuPwd }"/></td>
	        </tr>
	        <tr>
	            <td class="tdBg" width="200px">性别：</td>
	            <td>
	            	<input type="radio" name="stuGender" value="true" <c:if test="${SYS_STUDENT.stuGender }">checked="checked"</c:if> >男
	            	<input type="radio" name="stuGender" value="false" <c:if test="${!SYS_STUDENT.stuGender }">checked="checked"</c:if> >女
	            </td>
	        </tr>
	        <tr>
            <td class="tdBg" width="200px">生日：</td>
	            <td>
	            	<input type="date" name="stuBirth" value="${SYS_STUDENT.stuBirth }">	            
	            </td>
	        </tr>
    	</table>
    	
    	<div class="tc mt20">
	        <input type="button" class="btnB2" value="保存" onclick="doSubmit()"/>
	        &nbsp;&nbsp;&nbsp;&nbsp;
	        <input type="button"  onclick="javascript:history.go(-1)" class="btnB2" value="返回" />
	    </div>
    		</div>
    	</div>
    	</div>
    </form>
  </body>
</html>
