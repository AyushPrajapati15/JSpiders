function fun()
{
    var col = document.querySelector("select").value;
    document.getElementById("mess").innerHTML = `I like ${col} color`;
    document.getElementById("mess").style.color = col;
}