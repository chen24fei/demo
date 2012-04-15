<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>我的调查</title>
		<link rel="stylesheet" type="text/css" href='<s:url value="/styles.css" />'>
	</head>
	<body>
		<s:include value="/header.jsp" />
		<s:if test="mySurveys.isEmpty() == true">目前您没有任何调查项!</s:if >
		<s:else>
			<table>
				<tr>
					<td colspan="7" style="height: 5px"></td>
				</tr>
				<tr>
					<td colspan="7" class="tdHeader">我的调查:</td>
				</tr>
				<tr>
					<td colspan="7" style="height: 5px"></td>
				</tr>
				<tr>
					<td class="tdListHeader">ID</td>
					<td class="tdListHeader">调查标题</td>
					<td class="tdListHeader">创建时间</td>
					<td class="tdListHeader">设计</td>
					<td class="tdListHeader">收集信息</td>
					<td class="tdListHeader">分析</td>
					<td class="tdListHeader">删除</td>
				</tr>
				<s:iterator value="mySurveys">
					<s:set var="sId" value="id" />
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="title" /></td>
						<td><s:date name="createDate" format="yyyy/MM/dd hh:mm:ss"/></td>
						<td><a href='<s:url value="SurveyAction_designSurvey.action"><s:param name="sId" value="#sId"/></s:url>' class="aList">设计</a></td>
						<td><a href='<s:url value="CollSurveyAction.action"><s:param name="sId" value="#sId"/></s:url>' class="aList" target="_blank">收集信息</a></td>
						<td><a href='<s:url value="SurveyAction_analyzeSurvey.action"><s:param name="sId" value="#sId" /></s:url>' class="aList">分析</a></td>
						<td><a href='<s:url value="SurveyAction_deleteSurvey.action"><s:param name="sId" value="#sId"/></s:url>' class="aList">删除</a></td>
					</tr>
				</s:iterator>
			</table>
		</s:else>
	</body>
</html>