//we cannot call the function settime out above the function because hoisting is not possible here
var fun1 = () => {
    console.log("fun1");
}

var fun2 = () => {
    console.log("Fun2");
}

setTimeout(fun1,1000)
setTimeout(fun2,2000)