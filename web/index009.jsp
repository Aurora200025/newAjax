<%--
  Created by IntelliJ IDEA.
  User: Aurora
  Date: 2020/9/14
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function () {
            document.querySelector(".regist").onclick = function () {
                window.location.href = "selectAllCountry";
            }
        }
    </script>
</head>
<body>
    <form action="" method="post">
        <label>
            账号：<input type="text" name="name" value=""><br />
            密码：<input type="password" name="password" value=""><br />
            <input type="submit" value="登录"><br />
            <input class="regist" type="button" value="注册">
        </label>
    </form>
</body>
</html>
