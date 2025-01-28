function visible() {
  document.querySelector("input").type = "input";
  document.querySelector("img").src = "../../Asset/Image/eye-slash-solid.svg";
}

function invisible() {
  document.querySelector("input").type = "password";
  document.querySelector("img").src = "../../Asset/Image/eye-solid.svg";
}

function status() {
  var inp = document.querySelector("input").value;
  var inplen = inp.length;

  if (inplen == 0) {
    document.querySelector("span").innerHTML = "";
  } else if (inplen >= 1 && inplen <= 4) {
    document.querySelector("span").innerHTML = "Weak Password";
    document.querySelector("span").style.color = "red";
  } else if (inplen >= 5 && inplen <= 8) {
    document.querySelector("span").innerHTML = "Avg Password";
    document.querySelector("span").style.color = "orange";
  } else {
    document.querySelector("span").innerHTML = "Strong password";
    document.querySelector("span").style.color = "lawngreen";
  }
}

// function status() {
//   console.log("status");
  
// }
// function change() {
//   console.log("change");
  
// }