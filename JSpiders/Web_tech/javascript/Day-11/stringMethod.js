// var str = "Apple";

// var str1 = str.padStart(5, "B");
// console.log(str1);
// var str2 = str.padStart(7, "an");
// console.log(str2);
// var str3 = str.padEnd(10, "e");
// console.log(str3);


var str = `she shells seashells by the seashore,
The shells she sells are surely seashells
So if she sells shells on the seashore
I'm sure she sells seashore shells.`;

console.log(str.includes("by"));//t
console.log(str.includes("bye"));//f
console.log(str.startsWith("she"));//t
console.log(str.endsWith("shells"));//false because '.' is not there at end.
console.log(str.endsWith("shells."));//t

