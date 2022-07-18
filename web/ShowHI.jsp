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
公司信息:${LoginH.cshow}
公司名称:${LoginH.company}
公司电话:${LoginH.phone}
公司地址:${LoginH.caddress}
<input type="button" src="HrRevise.jsp" class="revise" value="修改信息">
展示信息:
展示id:${showComp.sid}
公司名称:${showComp.company}
展示id:${showComp.companyid}
标签${showComp.title}
招聘信息${showComp.information}
期望薪资${showComp.money}
<input type="button" src="ShowRervlet.jsp" class="Show" value="修改发布信息">
</body>
</html>
