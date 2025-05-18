var otp;
function otpWindow() {
    document.getElementById("otpcontainer").style.display = "block";
    var num1 = Math.trunc(Math.random() * 10);
    var num2 = Math.trunc(Math.random() * 10);
    var num3 = Math.floor(Math.random() * 10);
    var num4 = Math.floor(Math.random() * 10);
    otp = `${num1}${num2}${num3}${num4}`;
    document.getElementById("otpgen").innerHTML = otp;
}

function windClose() {
    document.getElementById("otpcontainer").style.display = "none";
    
}

function verifyOtp() {
    var userOtp = document.getElementById("otp").value;
    if(userOtp===otp)
    {
        document.querySelector("#result").innerHTML = "Valid OTP!"
        document.querySelector("#result").style.color = "green";
        document.querySelector("#result").style.marginLeft = "27%";
        
        // document.querySelector("form").action = "https://ayush.com";
        document.querySelector("submit").type="Submit"
        
    }
    else {
        document.querySelector("#result").innerHTML="Invalid OTP!"
        document.querySelector("#result").style.color = "red";
        document.querySelector("#result").style.marginLeft = "20%";
    }
}