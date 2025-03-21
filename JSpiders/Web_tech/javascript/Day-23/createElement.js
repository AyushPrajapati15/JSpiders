// var divTag = document.createElement("div");
// document.body.appendChild(divTag);
// divTag.style.width = "400px";
// divTag.style.height = "400px";
// divTag.style.backgroundColor = "black";

// var divTag2 = document.createElement("div");
// divTag.appendChild(divTag2);
// divTag2.style.width = "200px";
// divTag2.style.height = "200px";
// divTag2.style.backgroundColor = "red";

//***************************************************************************************************************************************************************** */

// var table = document.createElement("table");
// table.style.border="2px solid black"
// table.style.borderCollapse="collapse"
// document.body.appendChild(table);

// var tr1 = document.createElement("tr");
// var tr2 = document.createElement("tr");
// var tr3 = document.createElement("tr");


// var divtr1 = table.appendChild(tr1);
// var divtr2 = table.appendChild(tr2);
// var divtr3 = table.appendChild(tr3);

// var td1 = document.createElement("td");
// var td2 = document.createElement("td");
// var td3 = document.createElement("td");
// var td4 = document.createElement("td");
// var td5 = document.createElement("td");
// var td6 = document.createElement("td");

// td1.style.border="2px solid black";
// td2.style.border="2px solid black";
// td3.style.border="2px solid black";
// td4.style.border="2px solid black";
// td5.style.border="2px solid black";
// td6.style.border="2px solid black";

// var dtrtd1 =divtr1.appendChild(td1);
// var dtrtd2 =divtr1.appendChild(td2);
// var dtrtd3 =divtr2.appendChild(td3);
// var dtrtd4 =divtr2.appendChild(td4);
// var dtrtd5 =divtr3.appendChild(td5);
// var dtrtd6 =divtr3.appendChild(td6);

// td1.innerHTML="name";
// td2.innerHTML="Ayush";
// td3.innerHTML="Gender";
// td4.innerHTML="Male";
// td5.innerHTML="Contact";
// td6.innerHTML = "9876543210";



//OPTIMIZED WAY
var table = document.createElement("table");
document.body.appendChild(table)
table.style.border = "2px solid black";
table.style.borderCollapse = "collapse";
var row = [];
var cell = [];
for (i = 0; i <= 3; i++){
    row[i]=document.createElement("tr");
    table.appendChild(row[i])
    for (j = 0; j <= 1; j++){
        cell[j] = document.createElement("th");
        row[i].appendChild(cell[j]);
        cell[j].style.border = "2px solid black";
    }
}

var allTh = document.querySelectorAll("th");
console.log(allTh);

allTh[0].innerHTML="name";
allTh[1].innerHTML="Alice";
allTh[2].innerHTML="Gender";
allTh[3].innerHTML="Male";
allTh[4].innerHTML="Contact";
allTh[5].innerHTML = "9876543210";
allTh[6].innerHTML = "Email";
allTh[7].innerHTML = "alice@gmail.com";



// function add(name, names, gender, gen, contact, cont) {
//     for (i = 0; i <= 5; i++){
//         allTh[i] = name;
//     }

// }
