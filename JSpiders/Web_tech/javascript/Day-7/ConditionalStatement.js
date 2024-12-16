// var hh = prompt("Enter the Hours in 24hr format");
// var am_pm = "AM";
// if (hh >= 12)
// {
//     am_pm = "PM";
//     if (hh >= 13)
//     {
//         hh = hh - 12;
//     }
// }
// if (hh == 0)
// {
//     hh = 12;
// }
// if (hh > 12)
// {
//     console.log("invalid input");

// }
// else {
//     console.log(hh+":00"+am_pm);
// }

// //Even Odd
// var num = prompt("Enter a number");
// if (num%2==0) {
//     console.log(num+" is Even number");

// } else {
//     console.log(num+" is Odd number");

// }

//WAPTP Fizz if it is multiple of two Buzz if it is multiple of 3 fizzbuzz if it is multiple of both. else number, range is 0-100.

var num = prompt("Enter a number between 0-100");

if (num > 0 && num <= 100) {
  if (num % 2 == 0 && num % 3 == 0) {
    console.log("FizzBuzz");
  } else if (num % 2 == 0) {
    console.log("Buzz");
  } else if (num % 3 == 0) {
    console.log("Fizz");
  } else {
    console.log(num);
  }
}
else {
    console.log("Number exceed the range 0 - 100");
    
}