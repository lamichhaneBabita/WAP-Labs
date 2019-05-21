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
    var decor = '<ol>';
    for (var i = 0; i < data.length; ++i) {
        decor += '<li>(' + data[i].wordType + ") :: " + data[i].definition + '</li>';
    }
    decor += '</ol>';
    $("#result").html(decor);
}

function ajaxFailure(xhr, status, exception) {
    $("#result").text("try another word");
   console.log(xhr, status, exception);
}
