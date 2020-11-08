<%--
  Created by IntelliJ IDEA.
  User: Aurora
  Date: 2020/9/14
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function () {
            var contryEle = document.querySelector(".countrySelect");
            contryEle.onchange = function () {
                //发送一个异步请求
                //1.创建一个对象
                var xmlHttp = new XMLHttpRequest();
                //模拟一个异步请求
                xmlHttp.open("get","selectAreaByCid?cid="+this.value,true);
                xmlHttp.send();
                //一直观察着响应的状态--状态码
                //状态为4的时候处理响应信息
                xmlHttp.onreadystatechange = function () {
                    if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
                        //处理信息
                        // var areaSpanEle = document.querySelector(".areaSpan");
                        // console.log("aaa");
                        // console.log(xmlHttp.responseText);
                        // areaSpanEle.innerHTML = xmlHttp.responseText;
                        var areaSelect = document.querySelector(".areaSelect");
                        areaSelect.options.length = 0;
                        var da = document.createElement("option");
                        da.innerHTML = "====请选择====";
                        areaSelect.appendChild(da);
                        // //
                        // var responseText = xmlHttp.responseText;
                        // var requestText = responseText.substring(1,responseText.length-1);
                        // var objects = requestText.split(";");
                        // for (var i=0; i<objects.length; i++) {
                        //     var obj = objects[i].substring(1,objects[i].length-1);
                        //     var kv = obj.split(",");
                        //     var key = kv[0].split(":")[1];
                        //     var value = kv[1].split(":")[1];
                        //     var optionEle = document.createElement("option");
                        //     optionEle.setAttribute("key",key);
                        //     optionEle.innerHTML = value;
                        //     areaSelect.appendChild(optionEle);
                        //json
                        // var responseText = xmlHttp.responseText;
                        // var jsonObject = JSON.parse(responseText);
                        // console.log(jsonObject);
                        // var areaList = jsonObject.areaList;
                        // for (var i=0; i<areaList.length; i++) {
                        //     var area = areaList[i];
                        //     var newOption = document.createElement("option");
                        //     newOption.setAttribute("value",area.aid);
                        //     newOption.innerHTML = area.aname;
                        //     areaSelect.appendChild(newOption);
                        // }
                    }
                }
            }
        }
    </script>
</head>
<body>
    <form action="" method="post">
        <label>
            账号：<input type="text" name="name" value=""><br />
            密码：<input type="password" name="password" value=""><br />
            确认密码：<input type="password" name="password" value=""><br />
            性别：
            <input type="radio" name="sex" value="男">男<br />
            <input type="radio" name="sex" value="女">女<br />
            国家：
            <select class="countrySelect">
            <option>=====请选择====</option>
                <c:forEach var="country" items="${requestScope.countryList}">
                    <option value="${country.cid}">${country.cname}</option>
                </c:forEach>
            </select>
            地区：
            <span class="areaSpan">
                <select class="areaSelect">
                    <option>====请选择====</option>
                </select>
            </span>
            城市：<select>
                <option>====请选择====</option>
            </select>
            <br />
            电话：<input type="text" name="" value=""><br />
            邮箱：<input type="text" name="" value=""><br />
            <input type="submit" value="注册">
            <input type="reset" value="重置">

        </label>
    </form>
</body>
</html>
