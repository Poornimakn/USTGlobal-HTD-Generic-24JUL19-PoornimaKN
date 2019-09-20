//Event
function Hello()
{
    alert("Hello!!!");
}
let buttonEle=document.getElementById('clickButton');
buttonEle.onclick=function(){alert("Hello World");}

let a=document.getElementById('click');
a.onclick= function(){
  let b= document.createElement('button'); 
  b.textContent='Thank you for creating without error';
  document.body.appendChild(b);   
}

let c=document.getElementById('hii');
c.onclick=function()
{
    alert('Hello P!');
}

//Event Listener
let alertEle=document.getElementById('hi');
alertEle.addEventListener('click',function(){
    alert("Good Evening");
})

let e=document.createElement('p'); //create only single ele
function showText(){
let d=document.getElementById('text');
d.value;
// let e=document.createElement('p'); cz will create element evry time
e.textContent=d.value;
document.body.appendChild(e);
}

