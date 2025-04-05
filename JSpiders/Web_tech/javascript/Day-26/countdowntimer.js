

var num = 60;
function fun() {
    num--;
    document.querySelector("#timer").value = num;
    if (num != 0) {
        setTimeout(fun, 10)
    }
    else {
        num = 60;
    }
    
    
}
