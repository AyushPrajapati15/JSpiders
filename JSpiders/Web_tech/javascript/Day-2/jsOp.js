console.log("This is in browser console");
console.log(10 + 5);
console.log(console);
console.log(window);

// document.write("This is on <b style='color:red'><i> User</i></b> interface");
// document.writeln("<br> One");
// document.writeln("Two");
// window.alert("OOPS");
// alert("this is second alert");
// window.document.write("This is on UI");

// the above commented lines will not work with defer
console.log(document.getElementById("heading"));
document.getElementById("heading").innerHTML = "This is inside H1 tag";
document.getElementById("heading1").innerText = "inner text";
document.getElementById("heading2").innerText = "<p>content int js</p>";
