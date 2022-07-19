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
//薪资范围的展示
function showRange() {
    $('.First').toggleClass('hidden');
    $('.o').show();
}
$(document).on('click', '.o', function () {
    $('.First').addClass('hidden');
    var text = $(this).text();
    $('.one').val(text);
    $.ajax({
        "url":"RangeServlet",
        "type":"get",
        "async":false,
        "data":"o="+$(this).text(),
        "dataType":"text",
        "success" :function (){
            window.location="Hall.jsp";
        },
    })
})
function range(value) {
    $('.o').show();
    $('.o').each(function () {
        var text = $(this).text();
        if (text.indexOf(value) == -1) {
            $(this).hide();
        }
    });
}
$(document).click(function (e) {
    if ('one' != e.target.className) {
        $('.First').addClass('hidden');
        var a = $('hidden').val();
    }
});

// function otherRange() {
//     $('.Second').toggleClass('hidden');
//     $('.p').show();
// }
// $(document).on('click', '.p', function () {
//     $('.Second').addClass('hidden');
//     var text = $(this).text();
//     $('.two').val(text);
//     $.ajax({
//         "url":"feiFei",
//         "type":"get",
//         "async":false,
//         "data":"p="+$(this).text(),
//         "dataType":"text",
//         "success" :function (){
//             window.location="Hall.jsp";
//         },
//     })
// })
// function next(value) {
//     $('.p').show();
//     $('.p').each(function () {
//         var text = $(this).text();
//         if (text.indexOf(value) == -1) {
//             $(this).hide();
//         }
//     });
// }
// $(document).click(function (e) {
//     if ('two' != e.target.className) {
//         $('.Second').addClass('hidden');
//         var a = $('hidden').val();
//     }
// });