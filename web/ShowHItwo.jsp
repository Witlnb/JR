<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/18
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
公司信息:
公司编号:${LoginH.companyid}
<br>
公司信息:${LoginH.cshow}
<br>
公司名称:${LoginH.company}
<br>
公司电话:${LoginH.phone}
<br>
公司地址:${LoginH.caddress}
<br>
<a href="HrRevise.jsp">修改信息</a>
<br>
展示信息:
展示id:${showComp.sid}
<br>
公司名称:${showComp.company}
<br>
展示id:${showComp.companyid}
<br>
标签${showComp.title}
<br>
招聘信息${showComp.information}
<br>
期望薪资${showComp.money}
<br>
<a href="ShowRervlet.jsp">修改信息</a>
</body>
</html>