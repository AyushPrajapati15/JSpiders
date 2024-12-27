// function callback()
// {
//     console.log("This is call back function");
    
// }
// function callback1()
// {
//     console.log("This is call back function 1");
    
// }

// function higherorder(callback,callback1)
// {
//     callback();
//     console.log("This is Higher order function");
//     callback1();
    
// }

// higherorder(callback, callback1)



// function higherOrderFunction(calling) {
//     console.log("This is higher order function");
//     calling();
// }

// higherOrderFunction(function () {
//     console.log("This is call back function");
    
// })



//NESTED FUNCTION
// function parentFunction() {
    
//     console.log("This is parent function");
//     childFunction()
//     function childFunction() {
//         console.log("This is child function");
        
//     }
// }
// parentFunction()
// parentFunction().childFunction()


//OPTIMIZED WAY
function parent() {
    
    console.log("This is parent function");
    function child() {
        console.log("This is child function");
    }
    return child;
}
var child = parent();
child()
