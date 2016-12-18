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
	<form action="<%=path%>/login" method="post">
		用户名:<input type="text" name="username"><br> <br> 
		密    码:<input type="text" name="password"> 
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />  --%>
		<input type="submit" value="登录">
	</form>
</body>
</html>