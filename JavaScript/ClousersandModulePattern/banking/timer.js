var f = (function(){
    return function(){
        setInterval(() => {
            console.log("Rudy")
        }, 1000);
    };
})();
document.getElementById("timerset").onclick = f();