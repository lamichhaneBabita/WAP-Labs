(function(){
    "use strict";
 let animation =null;   
let btnStart;
let btnStop;
let txtShowAnimation;
let currentTextAnimation;
let index = 0;
let slectAnimation;
let timer = null;
let checkSpeed;
let delay = 250;
let selectFont;

window.onload = function(){
    
    txtShowAnimation = document.getElementById("txtShowAnimation");

    btnStart = document.getElementById("btnStart");
    btnStart.onclick = startAnimation;

    btnStop = document.getElementById("btnStop");
    btnStop.onclick= stopAnimation;

    slectAnimation = document.getElementById("slectAnimation");
    slectAnimation.onchange = changeAnimationText;
    slectAnimation.selectedIndex = 0;

    checkSpeed = document.getElementById("checkSpeed");
    checkSpeed.onchange = changeDelay;

    selectFont = document.getElementById("selectFont");
    selectFont.onchange = changeFontSize;
    selectFont.selectedIndex = 2;

};

function changeFontSize(){
    txtShowAnimation.style.fontSize = selectFont.options[selectFont.selectedIndex].value;
}

function startAnimation(){
    toogleControl('start');
    currentTextAnimation = txtShowAnimation.value;
    if (timer === null){
        timer = setInterval(changeFrame, delay);
    }
}

function changeDelay(){
    if(checkSpeed.checked){
        delay =50;
        clearInterval(timer);
       timer= setInterval(changeFrame, delay)
    }
    else{
        delay = 250;
        clearInterval(timer);
        timer = setInterval(changeFrame, delay);
    }
}

function stopAnimation(){
    toogleControl('stop');
    if(timer!==null){
        clearInterval(timer);
        timer= null;
    }
    index = 0;
    restoreOrginalInfo();


}
function toogleControl(state){
    if (state === 'start') {
        btnStart.disabled = true;
        btnStop.disabled = false;

        slectAnimation.disable = true;
    }
    else if(state === 'stop'){
        btnStart.disabled = false;
        btnStop.disabled = true;

    slectAnimation.disable = false;
    }
}
function changeAnimationText() {
    let selected = slectAnimation.options[slectAnimation.selectedIndex].value;
    animation = ANIMATIONS[selected];
    txtShowAnimation.value = animation;
}

function changeFrame(){
    let frames = currentTextAnimation.split("=====\n");
    txtShowAnimation.value = frames[index];
    index++;
    if(index === frames.length)
        index=0;


}
function restoreOrginalInfo(){
    txtShowAnimation.value= currentTextAnimation;
}

})();