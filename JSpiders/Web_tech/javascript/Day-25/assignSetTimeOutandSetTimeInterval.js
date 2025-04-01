var cir = document.querySelector("#container");
function fun1() {
    cir.style.transform = "translate(93vw)";

}
// setTimeout(fun1, 1000)
setInterval(fun1, 100)

function fun2() {
    cir.style.transform = "translate(93vw,87vh)";

}
// setTimeout(fun2, 2000)
setInterval(fun2, 200)

function fun3() {
    cir.style.transform = "translate(0vw,87vh)";

}
// setTimeout(fun3, 3000)
setInterval(fun3, 300)

function fun4() {
    cir.style.transform = "translate(0,0)";

}
// setTimeout(fun4,4000)
setInterval(fun4,400)