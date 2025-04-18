// function fun() {
//     console.log("This is callback func");
    
// }

// function higherOrdFun(callback) {
//     console.log("This is higher order function");
//     callback();
    
// }
// higherOrdFun(fun)


//************************************************************FILTER********************************************************************

// var arr = [1, 21, 33, 23, 4, 5, 5, 43, 66, 87, 44, 55, 53, 3, 4, 4, 43, 53, 5, 54, 53, 4, 3, 6, 4, 6, 45, 64, 56, 45, 64, 43];
// console.log(arr);
// // BY USING NORMAL FUNCTION
// var arr1 = arr.filter(fun);
// function fun(arr) {
    //     return arr >= 18 && arr <= 60;
    // }
    // console.log(arr1);
    
    
    // // BY USING ANNONYMOUS FUNCTION
    // var arr2=arr.filter(function (arr) {
        //     return arr > 10 && arr < 50;
        // })
        // console.log(arr2);
        
        
        // // BY USING ARROW FUNCTION
        // var arr3 = arr.filter((arr) => {
            //     return arr % 2 == 0;
            // })
            // console.log(arr3);
            
            
            // var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
            
            // var arr2=arr.filter((arr) => {
                //     return arr.length > 5;
                // })
                // console.log(arr2);
                
//************************************************************MAP********************************************************************
                
// var arr = [1, 21, 33, 23, 4, 5, 5, 43, 66, 87, 44, 55, 53, 3, 4, 4, 43, 53, 5, 54, 53, 4, 3, 6, 4, 6, 45, 64, 56, 45, 64, 43];
// console.log(arr);
                
// var arr1=arr.map((arr) => {
// // arr + 2;
// return arr+2 ;
// })
// console.log(arr1);
                
// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];

// var arr1=arr.map((arr) => {
//     // arr + 2;
//     return arr+" 5" ;
// })

// console.log(arr1);


//************************************************************FOR IN********************************************************************

// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
// for (n in arr){
//     console.log(n);
//     console.log(arr[n]);
    
// }


//************************************************************FOR OF********************************************************************
// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
// for (n of arr){
    //     console.log(n);
    
    // }
    
    
//************************************************************KEYS VALUES ENTRIES********************************************************************
// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
// var arr1 = arr.keys();
// var arr1 = arr.values();
// var arr1 = arr.entries();

// for (n of arr1) {
//     console.log(n);
// console.log(arr[n]);
// }


//************************************************************FIND, FNDINDEX********************************************************************
    
// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
// var res=arr.find(arr => {
//     return arr == "mango";
//         return arr. length > 5;  //it will return the first occurance
//     })
//     console.log(res);
    
    
// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
// var res = arr.findIndex(arr => {
//     return arr == "mango";
// })
// console.log(res);
    

//************************************************************EVERY, SOME********************************************************************

// var arr = [2,4,6,8];
// var res=arr.every(arr => {
//     return arr % 2 == 0;
// })
// console.log(res);


// var arr = [2,4,6,8,1];
// var res=arr.some(arr => {
//     return arr % 2 != 0;
// })
// console.log(res);

//************************************************************SORT********************************************************************

// var arr = ["apple", "grapes", "pineapple", "mango", "watermelon", "red", "green", "blue", "orange"];
// console.log(arr);
// var arr1 = arr.sort();
// console.log(arr1);//lexical sorting


// var arr = [1, 3, 2, 4, 6, 8, 23, 5, 555, 443, 76, 34, 8, 776, 456, 234, 543, 65, 12, 2];
// console.log(arr.sort());

// var arr1 = arr.sort((a, b) => {
//     return a - b;       //ascending
//     return b - a;       //descending
// })
// console.log(arr1);


//************************************************************FILL********************************************************************
// var arr = [1, 3, 2, 4, 6, 8, 23, 5, 555, 443, 76, 34, 8, 776, 456, 234, 543, 65, 12, 2];
// var arr1 = arr.fill("Ayush", 0,5);
// console.log(arr1);

// var arr = [1, 2, 5, 9, 51, 14, 27, 36, 221, 553, 101, 102]
// var arr1=arr.fill("red",0,3)
// var arr1=arr.fill("blue",6,9)
// var arr1 = arr.fill("orange", 11, 12);
// console.log(arr1);

// var arr1=arr.fill("red",0,3)
// var arr2=arr.fill("blue",6,9)
// var arr3 = arr.fill("orange", -1);
// console.log(arr2);



//************************************************************SLICE SPLICE********************************************************************

// var arr = [1, 2, 5, 9, 51, 14, 27, 36, 221, 553, 101, 102]
// var arr1=arr.slice(-14, 5);
// console.log(arr1);
// console.log(arr);

// var arr = [1, 2, 5, 9, 51, 14, 27, 36, 221, 553, 101, 102]
// var arr1 = arr.splice(0, 5);
// console.log(arr1);
// console.log(arr);



//************************************************************FLAT********************************************************************
// var arr = [1, 2, 3, [4, 5, [8, 5, 2, [7, 5, [8, 3, 1, [7, 2, 0, 1, [6, 5]]]]]]];
// var arr1=arr.flat()
// var arr2=arr.flat(Infinity)
// console.log(arr1);
// console.log(arr2);



//DELETE PROPERTY ASSIGNMENT

var arr = [1, 2, 5, 9, 51, 14, 27, 36, 221, 553, 101, 102]

