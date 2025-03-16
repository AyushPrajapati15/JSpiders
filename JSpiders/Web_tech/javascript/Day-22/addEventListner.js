var allinput = document.querySelectorAll("input");
console.log(allinput);

allinput[0].addEventListener("click",redcol)

function redcol() {
    document.body.style.backgroundColor = "red";
}


allinput[1].addEventListener("click",function () {
    document.body.style.backgroundColor = "blue";
})


allinput[2].addEventListener("click",()=>document.body.style.backgroundColor = "green")
