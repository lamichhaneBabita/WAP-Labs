// var f = (function(){
//     return function(){
//         setInterval(() => {
//             document.getElementById("display").innerHTML="Rudy";
//         }, 1000);
//     };
// })();


(function(){
    var timr = (function(){
    
    function alertTimer(){
        setInterval(function(){
           console.log('Ruddy');
        },1000);
    
    }
    return alertTimer;
})();
window.onload = function () {
document.getElementById("timerset").onclick = timr;
};
})();
