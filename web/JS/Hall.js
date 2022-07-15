function showOption() {
    $('.op-list').toggleClass('hidden');
    $('.iop').show();
}
$(document).on('click', '.iop', function () {
    $('.op-list').addClass('hidden');
    var text = $(this).text();
    $('.iput').val(text);
    $.ajax({
                "url":"ShowMoneyServlet",
                "type":"get",
                "async":false,
                "data":"iop="+$(this).text(),
                "dataType":"text",
                "success" :function (){
                    window.location="Hall.jsp";
                    },
    })
})
function search(value) {
    $('.iop').show();
    $('.iop').each(function () {
        var text = $(this).text();
        if (text.indexOf(value) == -1) {
            $(this).hide();
        }
    });
}
$(document).click(function (e) {
    if ('iput' != e.target.className) {
        $('.op-list').addClass('hidden');
        var a = $('hidden').val();
    }
});
//标签的展示
function showTT() {
    $('.showTitle').toggleClass('hidden');
    $('.st').show();
}
$(document).on('click', '.st', function () {
    $('.showTitle').addClass('hidden');
    var text = $(this).text();
    $('.title').val(text);
    $.ajax({
        "url":"TitleTest",
        "type":"get",
        "async":false,
        "data":"st="+$(this).text(),
        "dataType":"text",
        "success" :function (){
            window.location="Hall.jsp";
},
    })
})
function test(value) {
    $('.st').show();
    $('.st').each(function () {
        var text = $(this).text();
        if (text.indexOf(value) == -1) {
            $(this).hide();
        }
    });
}
$(document).click(function (e) {
    if ('title' != e.target.className) {
        $('.showTitle').addClass('hidden');
        var a = $('hidden').val();
    }
});
