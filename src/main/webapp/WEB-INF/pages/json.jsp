<%@ page contentType="text/html;charset=UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>json</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <base href=" <%=basePath%>">
</head>
<body>
<table>
    <tr>
        <td>用户名:</td>
        <td><input id="username"></td>
    </tr>
    <tr>
        <td>密码:</td>
        <td><input id="password"></td>
    </tr>
    <tr>
        <td>姓名:</td>
        <td><input id="name"></td>
    </tr>
    <tr>
        <td>邮箱:</td>
        <td><input id="email"></td>
    </tr>
</table>
<button id="submitForm">提交</button>

<script type="text/javascript">
    $(document).ready(function(){
        $('#submitForm').click(function(){
            var formData = new Object;
            formData.username = $('#username').val();
            formData.passWord = $('#password').val();
            formData.name = $('#name').val();
            formData.email = $('#email').val();
            var JsonData = JSON.stringify(formData);
            console.log(JsonData);
            $.ajax({
                type : "POST",
                url : "/jsonForm",
                dataType : 'text',
                contentType: "application/json",
                data : JsonData,
                success : function(data) {
                    alert(data);
                }
            });
        });
    });
</script>
</body>
</html>
