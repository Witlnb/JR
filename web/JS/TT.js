$(document).ready(function () {
    $("#chooseUser").mouseover(function () {
        $(".Boss,.Boss").show();
    }).mouseleave(function () {
        $(".Boss").hide();
    })
    $("#chooseBoss").mouseover(function () {
        $(".User,.User").show();
    }).mouseleave(function () {
        $(".User").hide();
    })
    var count = 1;
    var inum=1000;
    var met= function method1(){
        $("#pictureDiv").animate({"left": -1920*count+"px"},inum);
        if(count==4){
            count=1;
            $("#pictureDiv").animate({"left": 0+"px"},0);
        }else{
            count++;
        }
        changeColor();
    }
    var inter=setInterval(met,3000);
    $("#btnNext").click(function(){
        clearInterval(inter);
        changeColor();
        upnew();
    })

    $("#btnPre").click(function(){
        clearInterval(inter);
        if(count<2){
            count=3;
        }else if(count==2){
            count=0;
        }else{
            count=count-2;
        }
        changeColor();
        upnew();
    })
    $("#con>div").click(function(){

        clearInterval(inter);
        count=$(this).index();
        changeColor();
        upnew();
    })
    function changeColor(){
        $("#con>div").css("background-color","darkgray");
        $("#con>div").eq(count-1).css("background-color","#95f509");
    }
    function upnew(){
        inum=10;
        met();
        inum=1000;
        inter=setInterval(met,3000);
    }

    var div=$(".sj");
    for (let i = 0; i <1000 ; i++) {
        div.animate({top:'230px'},"slow");
        div.animate({top:'210px'},"slow");
        div.animate({top:'230px'},"slow");
        div.animate({top:'210px'},"slow");
        div.animate({top:'230px'},"slow");
    }
})