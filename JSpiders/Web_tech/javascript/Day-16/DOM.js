var allHeadings = document.getElementsByClassName("Heading");
console.log(allHeadings);

allHeadings[0].innerHTML = "This is heading 0";
allHeadings[1].innerHTML = "This is heading 1";
allHeadings[2].innerHTML = "This is heading 2";

var allPara = document.getElementsByClassName("para");
console.log(allPara);
allPara[0].innerHTML = "This is para 0";
allPara[1].innerHTML = "This is para 1";



var allSpan=document.getElementsByTagName("span");
allSpan[0].innerHTML = "This is span tag";



var allH2 = document.getElementsByName("h2");
allH2[0].innerHTML = "This is h2  0";
allH2[1].innerHTML = "This is h2 1";


document.querySelector("#span").innerHTML = "This is span tag targetted by using query selector"
document.querySelector(".span").innerHTML = "This is span tag targetted by using query selector"
document.querySelector("b").innerHTML = "This is bold tag";


var allDivId = document.querySelectorAll("#div");
console.log(allDivId);
allDivId[0].innerHTML="1st span with id"
allDivId[1].innerHTML="2nd span with id"
allDivId[2].innerHTML="3rd span with id"

var allSpanClass = document.querySelectorAll(".div");
console.log(allSpanClass);
allSpanClass[0].innerHTML = "1st span with class";
allSpanClass[1].innerHTML = "2nd span with class";
allSpanClass[2].innerHTML = "3rd span with class";


var allItalic = document.querySelectorAll("i")
console.log(allItalic);
allItalic[0].innerHTML = "1st itallic ";
allItalic[1].innerHTML = "2nd itallic";
allItalic[2].innerHTML = "3rd itallic";
