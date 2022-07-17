<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/16
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link href="Css/Enroll.css" rel="stylesheet" type="text/css">
    <script src="JS/jquery-3.6.0.js"></script>
    <script src="JS/MulJq.js" type="text/javascript"></script>
    <script src="JS/Enroll.js" type="text/javascript"></script>
    <style type="text/css">
    </style>
</head>
<a>
    <img src="img/logo.png"><br>
    <img src="img/xuanchuan.png">
</a>
<!--主体-->
<div id="content">
    <!--头部-->
    <div class="content-header clearfix">
        <ul id="tit">
            <span class="select"><li><a  class="current" >用户注册</a></li></span>
           <span><li><a >企业注册</a></li></span>
        </ul>
    </div>
    <!--内容-->
    <div class="content-body">
        <div class="dom" style="display: block">
            <ul id="con">
                <li id="1" class="show">
                    <form action="EnrollServlet" method="post">
                        <div class="s1">
                            用&nbsp;&nbsp;户&nbsp;&nbsp;名:<input type="text" name="uname" autofocus required><label></label>
                        </div>
                        <div class="s1">
                            密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="upwd" required><label></label>
                        </div>
                        <div class="s1">
                            手&nbsp;&nbsp;机&nbsp;&nbsp;号:<input type="text" name="phone" required><label></label>
                        </div >
                        <div class="s1">
                            邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:<input type="email" name="email"  required><label></label>
                        </div>
                        <div class="s1">
                            身份证号:<input type="text" name="nid"  required><label></label>
                        </div>
                        <div class="s1">
                            学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<select name="study" required>
                            <option value="" selected="selected">请选择</option>
                            <option value="初中及以下">初中及以下</option>
                            <option value="高中">高中</option>
                            <option value="中专/中技">中专/中技</option>
                            <option value="大专">大专</option>
                            <option value="本科">本科</option>
                            <option value="硕士">硕士</option>
                            <option value="博士">博士</option></select><label></label>
                        </div>
                        <div class="s1">
                            工作经验:<select name="job" required>
                            <option value="" selected="selected">请选择</option>
                            <option value="无经验">无经验</option>
                            <option value="一年以下">一年以下</option>
                            <option value="1-3年">1-3年</option>
                            <option value="3-5年">3-5年</option>
                            <option value="5-10年">5-10年</option>
                            <option value="10年以上">10年以上</option></select><label></label>
                        </div>
                        <div class="s2">
                            性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:<input type="radio" name="sex" value="男">男<input type="radio" name="sex" value="女">女<label></label>
                        </div>
                        <div class="s1">
                            地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:<input type="text" name="address"  required><label></label>
                        </div>
                        <div class="s1">
                            简&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历:<input type="text" name="personal"  required><label></label>
                        </div>
                        <input type="submit" value="注&nbsp;册" class="btn">
                    </form>
                </li>
                <li id="2">
                    <div class="dom" >
                    <form action="HrEnrollServlet" method="post">
                        <div class="s1">
                            公司名称:<input type="text" name="company"  required><label></label>
                        </div>
                        <div class="s1">
                            公司信息:<input type="text" name="cshow"  required><label></label>
                        </div>
                        <div class="s1">
                            预计薪资:<input type="text" name="hmoney" required><label></label>
                        </div>
                        <div class="s1">
                            地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:<input type="text" name="caddress" required><label></label>
                        </div>
                        <div class="s1">
                            手&nbsp;&nbsp;机&nbsp;&nbsp;号:<input type="text" name="phone" required><label></label>
                        </div>
                        <div class="s1">
                            密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="cpwd" required><label></label>
                        </div>
                        <input type="submit" value="注&nbsp;册" class="btn">
                    </form>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
    <script>
        $('#tit span').click(function() {
            var i = $(this).index();//下标第一种写法
            $(this).addClass('select').siblings().removeClass('select');
            $('#con li').eq(i).show().siblings().hide();
        });
        var ur = location.href;
        var type = ur.split('?')[1].split("=")[1];
        $('#tit span').eq(type - 1).addClass('select').siblings().removeClass('select');
        $('#con li').eq(type - 1).show().siblings().hide();
    </script>
    </body>
</html>
