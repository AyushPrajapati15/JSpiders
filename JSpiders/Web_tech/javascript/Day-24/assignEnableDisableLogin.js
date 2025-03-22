var input1 = document.getElementById("inp1");
var input2 = document.getElementById("inp2");
document.body.style.backgroundColor = "black";

input1.setAttribute("placeholder", "Enter password")
function fun() {
    var len = input1.value;
    var leng = len.length
    if (leng >= 5) {
        input2.removeAttribute("disabled");
    }
    else {
        input2.removeAttribute("disabled",true);
        
    }
}

