<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="_csrf_header" content="${_csrf.headerName}" />
</head>
<body>
<script type="text/javascript">

    $(function () {

            var url = "http://localhost:8080/justdoit/oauth/rest_token";
            var args = {"grant_type":"client_credentials","scope":"read","client_id":"credentials","client_secret":"credentials","username":"user","password":"123"};

            $.post(url, args, function (data) {

                console.log(data)

            });
    });

</script>
<input type="text" id="nnm" name="username">


</body>
</html>