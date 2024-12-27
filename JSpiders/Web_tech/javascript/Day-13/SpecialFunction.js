// var fun = function ()
// {
//     console.log("this is a annonomus function and here hoisting is not possible");
    
// }
// fun()


// var add = function (num1, num2) {
//     console.log(num1+num2);
    
// }
// add(10, 20)


// var prod=function(num1, num2)
// {
//     return num1 * num2;
// }
// console.log(prod(10,5));




//WAPTF area of triangle
// var triangle = function (base, height)
// {
//     return 0.5 * base * height;
// }
// var base=prompt("enter the base");
// var height=prompt("enter the height");
// console.log(triangle(base, height));



//IIFE( Immediate invoked Functional Expressiono)
// (function () {
//     console.log("This is IIFE"`${a}`);
    
// })();



//DIFFERENCE BETWEEN ANNONOMUS AND IIFE FUNCTION
// var fun1 = function ()
// {
//     console.log("This is annonomus function");
        
// }

// var fun2 = (function ()
// {
//     console.log("This is IIFE function");
//     return 10;
    
// })();

// console.log(fun1);
// console.log(fun2);




// (function (a, b)
// {
//     console.log(a+b);
    
// })(10,20);
//ANNONOMUS FUNCTION NEED TO BE STORED BUT IIFE DON'T NEED TO BE STORED IN A VARIABLE




// ARROW FUNCTION

// var arr = () => {
//     console.log("This is arr function.");
    
// }
// arr()

// var arr = () => console.log("This is arrow fun")
// arr()

// var add = (num1, num2) => console.log(num1+num2);
// add(10,10)

// var addi = (num1) => {
//     return num1 + 5;
// }
// console.log(addi+(5));


// var prod=a=>console.log(a*2);
// prod(2)

// var mul = num3 =>{return num3 * 2};
// console.log(mul(9));




//ASSIGNMENT
var square = function (side)
{
    return side ** 2;  
}

var triangle = function (base, height)
{
    return 0.5 * base * height;
}

var rectangle = function (l, b)
{
    return l * b;
    
}

var sq = square(10);
var tri= triangle(10, 3);
var rect = rectangle(7, 3);
var res = sq - (tri + rect);
console.log(res);


