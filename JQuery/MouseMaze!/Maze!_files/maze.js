(function(){
    "use strict";
    $(function(){
        $(".boundary").mouseover(turnRed);
    });
    let disqualified = false;
    let gameComplete = false;

    function turnRed(){
        $(".boundary").addClass("You loose");
        disqualified =true;
    }

});