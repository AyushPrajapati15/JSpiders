var num = 0;
function toggle() {
    num++;
    console.log(num);
    if (num % 2 != 0) {
        document.getElementById("format").innerHTML = "DAY";
        document.getElementById("circle").style.transform = "translate(330%) rotate(360deg)"
        document.body.style.backgroundColor="white"
        document.getElementById("para").style.color = "black";
        
    }
    else {
        document.getElementById("format").innerHTML = "NIGHT";
        document.getElementById("circle").style.transform="translate(0%) rotate(0deg)"
        document.body.style.backgroundColor="black"
        document.getElementById("para").style.color = "white";
        
    }
    
}