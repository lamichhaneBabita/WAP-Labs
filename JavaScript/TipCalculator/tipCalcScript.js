function calculateTip(){
    var total = 0;
    var subtotal = document.getElementById("subtotal");
    subtotal.innerHTML = subtotal;
    var tip = document.getElementById("tip");
    tip.innerHTML=tip;
    total=subtotal+((subtotal*tip)/100);
    total.innerHTML = '$'+total;
    
}