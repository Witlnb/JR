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
                    // window.location="Hall.jsp";
                    $("#ShowAll").load(location.href+"#ShowAll");
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