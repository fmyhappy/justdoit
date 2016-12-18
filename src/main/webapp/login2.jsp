<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf_header" content="${_csrf.headerName}" />
<title>欢迎登录</title>
</head>
<body>
	<form action="<%=path%>/oauth/token" method="post">
		client_id:<input type="text" name="client_id" value="mobile_1"><br> <br>
		client_secret:<input type="text" name="client_secret" value="secret_1">
		grant_type:<input type="text" name="grant_type" value="client_credentials">
		scope:<input type="text" name="scope" value="read">
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />  --%>
		<input type="submit" value="登录">
	</form>
</body>
</html>