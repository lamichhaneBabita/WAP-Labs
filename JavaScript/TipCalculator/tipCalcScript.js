window.onload = function(){
    document.getElementById("calculateTip").onclick=calculateTip;
}
function calculateTip(){
    
    var subtotal = document.getElementById("subtotal");
 subtotal=parseFloat(subtotal.value);
   // subtotal.innerHTML = subtotal;
    var tip = document.getElementById("tip");
    tip = parseFloat(tip.value);
   // tip.innerHTML=tip;
   var total=document.getElementById("total"); 

    total.innerHTML='$'+ (subtotal+(subtotal*(tip/100)));
    
}
