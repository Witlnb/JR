<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/12
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="Css/UserEnroll.css"  rel="stylesheet"  type="text/css"  />
</head>
<body>
<div id="loginDiv">
    <form action="EnrollServlet" method="post">
        <h1>注册</h1>
        <p>用&nbsp;&nbsp;户&nbsp;&nbsp;名:<input name="id" type="text" autofocus required><label></label></p>

        <p>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input name="upwd" type="password" required><label></label></p>

        <p>手&nbsp;&nbsp;机&nbsp;&nbsp;号:<input name="phone" type="tel" required><label></label></p>
        <p>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:<input name="email" type="email" required><label></label></p>
        <p>身份证号:<input name="nid" type="text" required><label></label></p>
        <p>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<select name="study" required><option value="" selected="selected">请选择</option>
            <option value="初中及以下">初中及以下</option>
            <option value="高中">高中</option>
            <option value="中专/中技">中专/中技</option>
            <option value="大专">大专</option>
            <option value="本科">本科</option>
            <option value="硕士">硕士</option>
            <option value="博士">博士</option></select><label></label></p>
        <p>工作经验:<select name="job" required><option value="" selected="selected">请选择</option>
            <option value="无经验">无经验</option>
            <option value="一年以下">一年以下</option>
            <option value="1-3年">1-3年</option>
            <option value="3-5年">3-5年</option>
            <option value="5-10年">5-10年</option>
            <option value="10年以上">10年以上</option></select><label></label></p>
        <p>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:<input name="sex" type="radio" value="男">男<input name="sex" type="radio" value="女">女<label></label></p>
        <p>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:<input name="address" type="text" required><label></label></p>
        <p>简&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<input name="personal" type="file" required><label></label></p>
        <p style="text-align: center;">
            <input  type="submit" class="button" value="提交">
            <input type="reset" class="button" value="重置">
        </p>
    </form>

</div>
<script src="JS/jquery-3.6.0.js" type="text/javascript"></script>
<script src="JS/MulJq.js" type="text/javascript"></script>
</body>
</html>
