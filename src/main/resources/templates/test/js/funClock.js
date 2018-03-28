/**
 * Created by admin on 2018/3/28.
 */
var H='....';
var H=H.split('');
var M='.....';
var M=M.split('');
var S='......';
var S=S.split('');
var Ypos=50;
var Xpos=50;
var Ybase=8;
var Xbase=8;
var dots=12;
function clock() {
    var time = new Date();
    var secs = time.getSeconds();
    var sec = -1.57 + Math.PI * secs/30;
    var mins=time.getMinutes();
    var min = -1.57 + Math.PI * mins/30;
    var hrs = time.getHours();
    var hr = -1.57 + Math.PI * hrs/6 + Math.PI * parseInt(time.getMinutes())/360;
    for (var i=0;i < dots;++i) {
        document.getElementById("dig" + (i+1)).style.top = Ypos- 15 + 40 * Math.sin(-0.49 + dots + i / 1.9).toString() + "px";
        document.getElementById("dig" + (i+1)).style.left = Xpos - 14 + 40 * Math.cos(-0.49 + dots + i / 1.9).toString() + "px";
    }
    for (var i=0;i < S.length;i++) {
        document.getElementById("sec" + (i+1)).style.top = Ypos + i * Ybase * Math.sin(sec).toString() + "px";
        document.getElementById("sec" + (i+1)).style.left = Xpos + i * Xbase * Math.cos(sec).toString() + "px";
    }
    for (var i=0;i < M.length;i++) {
        document.getElementById("min" + (i+1)).style.top = Ypos + i * Ybase * Math.sin(min).toString() + "px";
        document.getElementById("min" + (i+1)).style.left = Xpos + i * Xbase * Math.cos(min).toString() + "px";
    }
    for (var i=0;i < H.length;i++){
        document.getElementById("hour" + (i+1)).style.top =Ypos+i*Ybase*Math.sin(hr).toString() + "px";
        document.getElementById("hour" + (i+1)).style.left=Xpos+i*Xbase*Math.cos(hr).toString() + "px";
    }
    setTimeout("clock()", 50);
}