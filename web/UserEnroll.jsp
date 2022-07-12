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
    <title>Title</title>
</head>
<body>
    <form>
        用户名:<input type="text" name="uname"><br>
        密码:<input type="password" name="upwd"><br>
        手机号:<input type="text" name="phone"><br>
        邮箱:<input type="email" name="email"><br>
        身份证号:<input type="text" name="nid"><br>
        学历:<select id="select">
            <option value="">请选择</option>
            <option value="初中及以下">初中及以下</option>
            <option value="高中">高中</option>
            <option value="中专/中技">中专/中技</option>
            <option value="大专">大专</option>
            <option value="本科">本科</option>
            <option value="硕士">硕士</option>
            <option value="博士">博士</option>
        </select><br>
        工作经验:<select id="select1">
            <option value="">请选择</option>
            <option value="无经验">无经验</option>
            <option value="一年以下">一年以下</option>
            <option value="1-3年">1-3年</option>
            <option value="3-5年">3-5年</option>
            <option value="5-10年">5-10年</option>
            <option value="10年以上">10年以上</option>
        </select><br>
        性别:男<input type="radio" name="sex" value="0">
        女<input type="radio" name="sex" value="1"><br>
        地址:<input type="text" name="address"><br>
        简历:<input type="file" name="personal"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
