var allCirRight=document.querySelectorAll(".circleright")
var allCirLeft = document.querySelectorAll(".circleleft")
function fun(val) {
    if (val=='top')
    {
        allCirRight[0].style.transform = "translate(-77.5vw,0px)";
        allCirLeft[0].style.backgroundColor = "green";
        allCirLeft[1].style.backgroundColor = "";
        allCirLeft[2].style.backgroundColor = "";
        allCirRight[1].style.transform = "translate(0px,0px)";
        allCirRight[2].style.transform = "translate(0px,0px)";
    }
    else if (val== 'middle') {
        allCirRight[1].style.transform = "translate(-77.5vw,0px)";
        allCirLeft[1].style.backgroundColor = "green";
        allCirLeft[0].style.backgroundColor = "";
        allCirLeft[2].style.backgroundColor = "";
        allCirRight[0].style.transform = "translate(0px,0px)";
        allCirRight[2].style.transform = "translate(0px,0px)";
    }
    else if (val == 'bottom') {
        allCirRight[2].style.transform = "translate(-77.5vw,0px)";
        allCirLeft[2].style.backgroundColor = "green";
        allCirLeft[1].style.backgroundColor = "";
        allCirLeft[0].style.backgroundColor = "";
        allCirRight[1].style.transform = "translate(0px,0px)";
        allCirRight[0].style.transform = "translate(0px,0px)";
    }
    else {
        allCirLeft[0].style.backgroundColor = "red";
        allCirLeft[1].style.backgroundColor = "red";
        allCirLeft[2].style.backgroundColor = "red";
        allCirRight[0].style.transform = "translate(0px,0px)";
        allCirRight[1].style.transform = "translate(0px,0px)";
        allCirRight[2].style.transform = "translate(0px,0px)";
        
    }
}