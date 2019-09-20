var abc=['Dog','Cat','Rabbit','Camel'];
var pqr=['Tomato','Potato','Onion','Brinjal']

//for each
abc.forEach(function(value,index){
    console.log(abc);
})

pqr.forEach(function(value,index)
{
    console.log(pqr);
})

//isArray
var abc1=Array.isArray(abc);
console.log(abc1);

var pqr1=Array.isArray(pqr);
console.log(pqr1);

//includes
var abc2=abc.includes('Cat');
console.log(abc2);

var pqr2=pqr.includes('Carrot');
console.log(pqr2);

//push
abc.push('Cow');
console.log(abc);

pqr.push('LadiesFinger');
console.log(pqr);

//pop
abc.pop();
console.log(abc);

pqr.pop();
console.log(pqr);

//shift
abc.shift();
console.log(abc);

pqr.shift();
console.log(pqr);

//unshift
abc.unshift('Giraffe');
console.log(abc);

pqr.unshift('Ginger');
console.log(pqr);

//splice
var abc3=abc.splice(1,2,'Elephant','Lion');//starts from index1 and after 2 index it ends
console.log(abc);
console.log(abc3);

var pqr3=pqr.splice(1,2,'Drumstick','Beetroot');
console.log(pqr);
console.log(pqr3);

//slice
var abc4=abc.slice(1,3);//starts from index 1 upto 3-1 i.e 2
console.log(abc4);

var pqr4=abc.slice(1,4);
console.log(pqr4);

//index of
var abc5=abc.indexOf('Lion');
console.log("Index of Lion is ",abc5);

var pqr5=pqr.indexOf('Beetroot');
console.log("Index of beetroot is ",pqr5);

//join
var abc6=abc.join('-');
console.log(abc6);

var pqr6=pqr.join(':');
console.log(pqr6);

//map
var abcnew=[10,20,30];
var abc7=abcnew.map(function(value)
{
   var res=value+10;
    return res;
})
console.log(abc7);

var pqrnew=['pqr','abc','xyz'];
var pqr7=pqrnew.map(function(value)
{
   var res=value+'lmn';
    return res;
})
console.log(pqr7);

//filter

var abc8=abcnew.filter(function(value)
{
    var res= value>10;
    return res;
})
console.log(abc8);

var pqr8=pqrnew.filter(function(value)
{
    var res=(value==='pqr'||value==='abc');
    return res;
})
console.log(pqr8);

