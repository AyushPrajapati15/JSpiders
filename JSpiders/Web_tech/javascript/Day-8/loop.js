var num = prompt("Enter a number");
for (let i = 1; i <= 10; i++)
{
    document.getElementById("result").innerHTML += num + " X " + i + " = " + (num * i)+"<btr>";
    // console.log(num+" X "+i+" = "+num*i);
    
}

