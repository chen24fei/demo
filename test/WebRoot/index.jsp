<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>登陆页面</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
	</head>
	<body>
		<s:include value="header.jsp" />
		<s:if test="#session['user'] != null">
			<div class="divNavigatorOuterFrame">
				<div class="divNavigatorInnerFrame" style="text-align: right;">
					欢迎<s:property value="#session['user'].nickName" />&nbsp;&nbsp;
				</div>
			</div>
			<div class="divWhiteLine"></div>
		</s:if>
		<form action='<s:url value="/user/login.action" />' method="post">
		<table>
			<tr>
				<td colspan="2" class="tdWhiteLine"></td>
			</tr>
			<tr>
				<td class="tdHeader" colspan="2">用户登陆</td>
			</tr>
			<tr>
				<td colspan="2" class="tdWhiteLine"></td>
			</tr>
			<tr>
				<td class="tdFormLabel" width="40%">E-mail:</td>
				<td class="tdFormControl">
					<input type="text" name="email" class="text" value="cenffei@gmail.com">
					<font class="fonterror"><br><s:fielderror><s:param>email</s:param></s:fielderror></font>
				</td>
			</tr>
			<tr>
				<td class="tdFormLabel">密码:</td>
				<td class="tdFormControl"><input type="password" name="password" class="text" value="123"></td>
				<font class="fonterror"><br/><s:fielderror><s:param>password</s:param></s:fielderror></font>
			</tr>
			<tr>
				<td class="tdFormLabel"></td>
				<td class="tdFormControl"><input type="submit" class="btn" value="登录"></td>
			</tr>
		</table>
		</form>
	</body>
</html>