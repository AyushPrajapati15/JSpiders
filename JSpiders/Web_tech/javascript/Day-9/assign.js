var color = prompt("Enter the color");
var car = prompt("Enter the car");

document.getElementById("ui").innerHTML = `I Like <span style="color:${color}"> ${color}</span> 
color <span style="color:${color}"> ${car}</span> car <img src="${color+car}.jpeg" alt="${color+" "+car}">`;

