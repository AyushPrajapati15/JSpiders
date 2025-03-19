var chart=document.querySelector("div")
var horMove = 0;
var verMove = 0;

document.addEventListener("keydown", function (val) {
    if (val.key.toLowerCase() == "d") {
        console.log(val.key);
        horMove += 5;
        chart.style.transform=`translate(${horMove}px,${verMove}px)`
        
    }
})

document.addEventListener("keydown", function (val) {
    if (val.key.toLowerCase() == "a") {
        console.log(val.key);
        horMove -= 5;
        chart.style.transform = `translate(${horMove}px,${verMove}px) rotate(180deg)`
        
        
    }
})
document.addEventListener("keydown", function (val) {
    if (val.key.toLowerCase() == "s") {
        console.log(val.key);
        verMove += 5;
        chart.style.transform=`translate(${horMove}px,${verMove}px) rotate(90deg)`
        
    }
})

document.addEventListener("keydown", function (val) {
    if (val.key.toLowerCase() == "w") {
        console.log(val.key);
        verMove -= 5;
        chart.style.transform = `translate(${horMove}px,${verMove}px) rotate(270deg)`
        
    }
});
