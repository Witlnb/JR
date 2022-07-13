$(document).ready(function () {
    $("input[name=upwd]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=upwd]").next().text(result);
            },
            "error":function (result) {
                $("input[name=upwd]").next().text(result);
            }
        });
    });
    $("input[name=phone]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=phone]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
    $("input[name=mark]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=mark]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
    $("input[name=email]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=email]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
    $("input[name=study]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=study]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
    $("input[name=job]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=job]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
    $("input[name=address]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=address]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
    $("input[name=personal]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"upwd="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=personal]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
});