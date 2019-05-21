$(document).ready(function () {
    $("#lookup").click(function () {
        var text = $("#term").val();
            $.ajax("./dictServlet",{
            type:'POST',
            data:{"word": text},
            dataType:'json'
        }).done(ajaxSuccess)
            .fail(ajaxFailure);
    });
})

function ajaxSuccess(data) {
    var html = '<ol>';
    for (var i = 0; i < data.length; ++i) {
        html += '<li>(' + data[i].wordtype + ") :: " + data[i].definition + '</li>';
    }
    html += '</ol>';
    $("#result").html(html);
}
function ajaxFailure(xhr,status,error) {
    console.log(xhr, status, exception);
}