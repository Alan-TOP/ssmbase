<%@ page contentType="text/html;charset=UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>变量</title>
    <base href=" <%=basePath%>">
</head>
<body>
<div>
    <form action="/bianLiangForm" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input name="username" size="15"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input name="password" size="15"></td>
            </tr>
            <tr>
                <td><button type="submit">提交</button></td>
                <td><button type="reset">重置</button></td>
            </tr>
        </table>
    </form>
    <span>服务器信息：${info}</span>
</div>
</body>
</html>
