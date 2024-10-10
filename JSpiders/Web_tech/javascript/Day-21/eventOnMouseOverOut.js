var num = 0;
var cont = document.getElementById("container");
console.log(num);

function fun() {
    num++;
    if (num == 1) {
        cont.style.backgroundColor = "indigo"
        cont.style.backgroundPosition = "200px 200px";
        console.log(num);
        
        
    }
    else if (num == 2) {
        cont.style.backgroundColor = "blue";
        console.log(num);
        
    }
    else if (num == 3) {
        cont.style.backgroundColor = "green";
        console.log(num);
        
    }
    else if (num == 4) {
        cont.style.backgroundColor = "yellow";
        console.log(num);
        
    }
    else if (num == 5) {
        cont.style.backgroundColor = "orange";
        console.log(num);
        
    }
    else {
        cont.style.backgroundColor = "red";
        console.log(num);
        
        num = 0;
    }
}