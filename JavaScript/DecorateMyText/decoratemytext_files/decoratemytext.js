(function(){
    "use strict"
let textarea;
let timerId = null;
window.onload = function(){
    textarea = document.getElementById("text");
    document.getElementById("biggerdecoration").onclick=setBiggerDecoration;
    document.getElementById("checkBox").onchange = changeBling;
};

function biggerDecoration(){
   let fontsize= window.getComputedStyle(textarea, null).getPropertyValue("font-size");
   textarea.style.fontSize=parseInt(fontsize)+ 2 + "px";
}

function changeBling(){

  let changeText=  document.getElementById("checkBox");
    if(changeText.checked){
        textarea.style.fontWeight = "bold";
        textarea.style.color = "green";
        textarea.style.textDecoration = "underline";
        document.body.style.backgroundImage = "url('hundred-dollar-bill.jpg')";
    }
    else{
        textarea.style.fontSize = "normal";
        textarea.style.color="black";
        textarea.style.textDecoration = "none";
        document.body.style.backgroundImage = "none";
    }
  
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