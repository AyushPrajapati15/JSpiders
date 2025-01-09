function fun()
{
    var allimages=document.images;
    for(i=0;i<=allimages.length-1;i++)
    {
        allimages[i].src=`./images/${i}.jpg`
    }
}
fun()