/**
 * Created by admin on 2018/3/8.
 */
function clickMe() {
    var str;
    var button = confirm("Clicked button");
    if (button==true) {
        str="you are select confirm";
    } else {
        str="your are select cancel";
    }
    document.getElementById("demo").innerHTML=str;
}