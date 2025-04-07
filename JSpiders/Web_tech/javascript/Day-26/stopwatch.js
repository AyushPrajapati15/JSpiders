var hh = 0;
var mm = 0;
var ss = 0;
var mil = 0; 

var isReset = false;



function fun1() {
    if (isReset) {
        return;
    }
    if (mil<100) {
        mil++;
        document.querySelector("#mili").value = mil;
        setTimeout(fun1, 10)
    } 
    else {
        mil = 0;    
        document.querySelector("#mili").value = mil;
        setTimeout(fun1, 10)
        setTimeout(fun2, 1)
    }

}


function fun2() {
    if (ss<60) {
        ss++;
        document.querySelector("#sec").value = ss;
        // setTimeout(fun2, 100)
    } 
    
    else {
        ss = 0;    
        document.querySelector("#sec").value = ss;
        setTimeout(fun3, 1)
    }
    
}
function fun3() {
    if (mm<60) {
        mm++;
        document.querySelector("#min").value = mm;
        // setTimeout(fun3, 100)
    } 
    else {
        mm = 0;    
        document.querySelector("#min").value = mm;
        setTimeout(fun4, 1)
    }
    
}
function fun4() {
    if (hh<24) {
        hh++;
        document.querySelector("#hour").value = hh;
        // setTimeout(fun4, 100)
    } 
    else {
        hh = 0;    
        document.querySelector("#hour").value = hh;
        setTimeout(fun1, 1)
        
    }
    
}

function reset() {
    isReset = true;
    mil = 0;
    ss = 0;
    mm =0;
    hh = 0;
    document.querySelector("#mili").value = mil;
    document.querySelector("#sec").value = ss;
    document.querySelector("#min").value = mm;
    document.querySelector("#hour").value = hh;
}