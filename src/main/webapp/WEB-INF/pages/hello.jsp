<%@ page contentType="text/html;charset=UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Hello</title>
    <base href=" <%=basePath%>">
</head>
<body>
<div>
    hello Alan!<br>
<img style="width: 300px" src="resources/img/kaola.jpg">
</div>
</body>
</html>
