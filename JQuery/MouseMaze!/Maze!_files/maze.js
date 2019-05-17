(function () {
    "use strict";
    $(function () {
        $("#start").click(reset);
        $(".boundary").mouseover(turnRed);
        $("#gameArea").mouseleave(cheating);
        $("#end").mouseover(result);
    });
    let disqualified = false;
    let gameComplete = false;

    function reset(){
        $(".boundary").removeClass("youLoose");
        disqualified=false;
        gameComplete = false;
        $("#status").html("Click the S to begin.").css("color", "black");
    }
    function turnRed(){
        $(".boundary").addClass("YouLoose");
        disqualified =true;
    }

    function result(){
       if(!disqualified)
           won();
          else
          lost(); 
       
    }
    function won(){
        $("#status").css("color", "Green").html("Congratulations, You Won!! Click S to play Again.");
        gameComplete=true;
    }
    function lost(){
        $("#status").html("Sorry, You Loose!! :( please Click S to play Again." ).css("color", "Red");
        gameComplete = false;

    }
    function cheating(){
       if(!gameComplete){
           turnRed();
           lost();
       }
    }
    

})();