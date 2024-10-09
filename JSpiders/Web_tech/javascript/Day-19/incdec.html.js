var num = 1;

function incre() {
    if (num >= 1 && num < 10) {

        num++;
        document.getElementById("number").value = num;
    }

}


function decre() {
    if (num > 1 && num <= 10) {
        num--;
        document.getElementById("number").value=num
    }

}

document.addEventListener("keydown", function (val) {

    if ((val.key == "+")&&(num >= 1 && num < 10)) {
            num++;
            document.getElementById("number").value=num
    }
    
})

document.addEventListener("keydown", function (val) {

    if ((val.key == "-")&&(num > 1 && num <= 10)) {
            num--;
        document.getElementById("number").value = num;
    }
    
})
