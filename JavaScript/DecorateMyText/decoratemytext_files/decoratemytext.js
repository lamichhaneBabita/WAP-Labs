(function(){
    "use strict"
let textarea;
let timerId = null;
window.onload = function(){
    textarea = document.getElementById("text");
    document.getElementById("biggerDecoration").onclick=setBiggerDecoration;
    document.getElementById("checkBox").onchange = blingText;
};
function biggerDecoration(){
   let fontsize= window.getComputedStyle(textarea, null).getPropertyValue("font-size");
   textarea.style.fontSize=parseInt(fontsize)+ 2 + "px";
}
function blingText(){
  let blingtext=  document.getElementById("text");
  blingtext.style.color = "green";
  blingtext.style.textDecoration = "underline";

}
function setBiggerDecoration(){
    if(timerId){
        clearInterval(timerId);
        timerId=null;
    }
    else{
       timerId = setInterval(biggerDecoration,2000)
    }

}



})();