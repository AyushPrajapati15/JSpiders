// var day=prompt("Enter the index of day")
// day=Number(day)
// switch (day) {
//     case 0:
//         console.log("Sunday");
//         break;
//     case 1:
//         console.log("Monday");
//         break;
//     case 2:
//         console.log("Tuesday");
//         break;
//     case 3:
//         console.log("Wednesday");
//         break;
//     case 4:
//         console.log("Thursday");
//         break;
//     case 5:
//         console.log("Friday");
//         break;
//     case 6:
//         console.log("Saturday");
//         break;

//     default:
//         console.log("Enter number between 0 - 6");
// }





// var num1 = prompt("Enter num1")
// num1 = Number(num1);
// var num2=prompt("Enter num2")
// num2 = Number(num2);
// var op = prompt("Enter Operation to perform");

// switch (op) {
//     case "add":
//         console.log(num1+num2);
//         break;
//     case "sub":
//         console.log(num1+num2);
//         break;
//     case "mul":
//         console.log(num1+num2);
//         break;
//     case "div":
//         console.log(num1+num2);
//         break;
//     default:
//         console.log("Enter the starting 3 letters of the operation to be performed in lowercase");
//         break;
// }




//WAP that takes a number and check whether the number is positive negative or zero, if the number is positive find even number or odd number.
// var num = prompt("Enter a number");
// num=Number(num)
// if (num > 0)
// {
//     if (num % 2 == 0)
//     {
//         console.log("Even number");
        
//     }
//     else {
//         console.log("Odd number");
        
//     }

// }
// else if (num < 0)
// {
//     console.log("Negative number");
    
// }
// else {
//     console.log("Number is 0");
    
// }





//WAP which takes number and check if the number is palindrome or not.
// var num = prompt("Enter a number");
// num = Number(num);
// var temp = num;
// var res = 0;
// while (temp != 0)
// {
//     res = res * 10 + (temp % 10);
//     temp=parseInt(temp/10);
    
    

// }
// res = parseInt(res);
// if (num == res)
// {
//     console.log("Palindrome number");
    
// }
// else {
//     console.log("Not a palindrome number"+res);
// }





//WAP which takes a year and check if the year is leap year or not.

// var leap = prompt("Enter the year");
// if ((leap % 4 == 0 && leap % 100 == 0) && leap % 400 != 0)
// {
//     console.log("Leap year");
    
// }
// else {
//     console.log("Not a leap year");
    
// }




//WAP which checks if a given string is palindrome or not.
// var str = prompt("Enter the string");
// var rev = "";
// for (let i = str.length; i >=0; i--) {
//     rev += str.charAt(i);
    
    
// }
// if (str == rev)
// {
//     console.log("palindrome");
    
// }
// else {
//     console.log("not a palindrome");
    
// }




//WAP to calculate factorial of a given number by using for loop.

// var num = prompt("Enter a number");
// var res = 1;
// for (let i = 2; i <= num; i++)
// {
//     res = res * i;
// }
// console.log(res);
//5-