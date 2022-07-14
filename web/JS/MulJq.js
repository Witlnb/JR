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
            }
        });
    });
    $("input[name=phone]").blur(function () {
        $.ajax({
            "url":"FUserReviseServlet",
            "type":"get",
            "data":"phone="+$(this).val(),
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
            "data":"mark="+$(this).val(),
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
            "data":"email="+$(this).val(),
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
            "data":"study="+$(this).val(),
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
            "data":"job="+$(this).val(),
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
            "data":"address="+$(this).val(),
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
            "data":"personal="+$(this).val(),
            "dateType":"text",
            "success" :function (result){
                $("input[name=personal]").next().text(result);
            },
            "error":function (result) {
            }
        });
    });
});
function judge() {
    var b = $(".spidOne").html();
    b = b.toString();
    b=b.replace(/\s+/g,"");
    var c = "ok";
    alert(c)
    if (c==b){
        $.ajax({
            "url": "ReviseUserServlet",
            "type": "get",
            "data": {
                "upwd": $("input[name=upwd]").val(), "phone": $("input[name=phone]").val()
                , "mark": $("input[name=mark]").val(), "email": $("input[name=email]").val(),
                "study": $("input[name=study]").val(), "job": $("input[name=job]").val()
                , "address": $("input[name=address]").val(), "personal": $("input[name=personal]").val()
            },
            "dateType": "text",
        });
        window.location="ReviseUserServlet";
    }else {
        $("input[name=button]").next().text("请检查输入信息是否完整或者是否正确");
    }
    //     $.ajax({
    //         "url":"ReviseUserServlet",
    //         "type":"get",
    //         "data": {"upwd":$("input[name=upwd]").val(),"phone":$("input[name=phone]").val()
    //             ,"mark":$("input[name=mark]").val(),"email":$("input[name=email]").val(),
    //             "study":$("input[name=study]").val(),"job":$("input[name=job]").val()
    //         ,"address":$("input[name=address]").val(),"personal":$("input[name=personal]").val()},
    //         "dateType":"text",
    //         success:function(){
    //                 window.location.href = 'ReviseUserServlet';
    //         },
    //         "error":function (result) {
    //             $("input[name=button]").next().text("请检查输入信息是否完整或者是否正确");
    //         }
    // });
}