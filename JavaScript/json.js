let employeeJSON={
    name :'Poornima',
    age: 21,
    hobbies:['dancing','gardening']
}
console.log('My Name is '+employeeJSON.name);
console.log(`My Age is ${employeeJSON.age}`);//string interpolation

let jsonObj = JSON.stringify(employeeJSON); //to convert js to json
console.log(jsonObj);
let jsObj = JSON.parse(jsonObj); //to convert json to js
console.log(jsObj);

let ename=employeeJSON.name;
console.log(ename)
let eage=employeeJSON.age;
console.log(eage);
//instead above code we can write code as following object destructuring
let{empname,empage}=employeeJSON;
console.log(empname);
console.log(empage);
//array destructuring
const hobbies=['singing','dancing','cricket'];
let h1=Array[0];
let h2=Array[1];

let{hob1,hob2}=Array;