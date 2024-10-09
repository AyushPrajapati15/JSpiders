// function hello()
// {
//     console.log("Hello Js!!");
// }
// hello()


/***********ADDITION***********/
// function add()
// {
    //     var num1 = prompt("Enter a number");
    //     var num2 = prompt("Enter a number");
    //     console.log(`Addition of ${num1} and ${num2} is ${Number(num1) + Number(num2)}`);
    // }
// add()
    

    
/***********Multiplication***********/
// function mul()
// {
    //     var num1 = prompt("Enter a number");
    //     var num2 = prompt("Enter a number");
    //     console.log(`Multiplication of ${num1} and ${num2} is ${num1 * num2}`);
    // }
    // mul()
    
    
    
/***********AREA OF CIRCLE***********/
// var pi = 3.14;

// function areaOfCircle() {
//     var radius = prompt("Enter the radius");
//     console.log(`Area of circle of radius ${radius} is ${pi*radius**2}`);
    
// }
// areaOfCircle();


//FUNCTIONS WITH ARGUMENTS
// function fun(uName, uId, uEmail, uGender)
// {
//     console.log(uName);
//     console.log(uId);
//     console.log(uEmail);
//     console.log(uGender);
// }
// fun("Alice", 1024, "alice@gmail.com", "Male")



// function add(num1, num2)
// {
//     console.log(num1+num2);
// }
// add(10, 20)
// add(20,40)



// function add(num1, num2)
// {
//     return num1 + num2;
// }
// console.log(add(10,20));
// console.log(add(50,10));

function loanForBike(p, r, t)
{
    console.log(`Loan Amount ${p}`);
    console.log(`Rate Of Intrest is ${r}%`);
    console.log(`Tenure is ${t} years`);
    var int = (p * r * t) / 100;
    console.log(`Total intrest is ${int} `);
    console.log(`EMI is ${(p+int)/(t*12)} `);
    // var emi = icici / (t * 12);

    
    return p + int;
}

var icici = loanForBike(2500000, 12, 5);
console.log(icici);
