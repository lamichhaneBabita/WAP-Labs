function calculateTip(){
    let total = 0;
    let subtotal = document.getElementById("subtotal").innerHTML;
    let tip = document.getElementById("tip").innerHTML;
    total=subtotal+((subtotal*tip)/100);
    total.innerHTML = '$'+total;
    
}