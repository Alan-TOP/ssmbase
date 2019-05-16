<%@ page contentType="text/html;charset=UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<body>
<h2>Hello Alan!</h2>
<a href="/hello">测试页</a>
<h2>springMVC前后台交互</h2>
<a href="/bianLiang">变量</a><br>
<a href="/bianLiang1">变量(别名)</a><br>
<a href="/duiXiang">对象</a><br>
<a href="/shuZu">数组</a><br>
<a href="/json">JSON</a><br>
</body>
</html>
