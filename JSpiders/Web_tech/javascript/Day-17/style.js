document.body.style.backgroundImage = "linear-gradient(75deg,teal,skyblue)"
document.body.style.backgroundSize="100% 100vh"

var container=document.getElementById("container")

container.style.width="45vw"
container.style.height="25vw"
container.style.backgroundColor = "black"
container.style.borderRadius="10px"
container.style.boxShadow="2px 2px 5px black"
container.style.marginLeft = "27vw"
container.style.marginTop="10%"

var heading = document.querySelector("h1");
console.log(heading);

heading.style.textAlign="center"
heading.style.color="white"
heading.style.fontSize="3vw"
heading.style.letterSpacing="1vw"
heading.style.padding="10px"

var allInp = document.querySelectorAll("input");
console.log(allInp);
for (i = 0; i <= 1; i++)
{
    allInp[i].style.width="80%"
    allInp[i].style.height = "3vw"
    allInp[i].style.backgroundColor="transparent"
    allInp[i].style.border="none"
    allInp[i].style.outline="none"
    allInp[i].style.borderBottom = "2px solid white"
    allInp[i].style.color = "white"
    allInp[i].style.fontSize="2vw"
    allInp[i].style.letterSpacing="0.8vw"
    allInp[i].style.fontWeight="bold"
    allInp[i].style.marginLeft="10%"
    allInp[i].required="true"
}

allInp[0].placeholder="Enter Your Email"
allInp[1].placeholder = "Enter Your Password"
allInp[0].type="email"
allInp[1].type="password"


// allInp[2].type="submit"
allInp[2].style.width="60%"
allInp[2].style.height="3vw"
allInp[2].style.marginLeft = "20%"
allInp[2].style.backgroundColor="white"
allInp[2].style.border="none"
allInp[2].style.borderRadius="10px"
allInp[2].style.fontSize="1.5vw"
allInp[2].style.fontWeight ="bold"


document.querySelector("#status").style.color = "red";
document.querySelector("#status").style.display="block";
document.querySelector("#status").style.textAlign="center";


function inputValues()
{
    var userEmail = allInp[0].value;
    var userPassword = allInp[1].value;
    console.log(userEmail,userPassword);
    
    if (userEmail == "ayush@gmail.com" && userPassword == "Ayush@123") {
        allInp[2].type="submit"
        // document.querySelector("form").action="https://tesla.com"
        document.querySelector("#status").style.color="green";
        document.querySelector("#status").innerHTML = "Valid";
        
    }
    else {
        document.querySelector("#status").innerHTML = "Invalid UserID or Password";  
    }
}


