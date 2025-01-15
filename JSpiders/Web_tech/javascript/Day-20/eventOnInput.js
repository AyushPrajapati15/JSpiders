function fun() {
    var color = document.getElementById("col").value;
    var deg = document.getElementById("deg").value;
    document.querySelector("body").style.backgroundImage=`linear-gradient(${deg}deg,${color})`;
}