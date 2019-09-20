/// <reference path="./rectangle.ts"/> 
//above reference should be in first line only

let myName='Poorni';
let company;
company='UST Global';
company=23;
console.log(company);
console.log(myName);

let sample:number| boolean;
sample=10;
sample=true;
console.log(sample);

let myArray=[1234, 'kjd', 'feddfd', true];
let myArr:string[]=['jhs','hysdg'];
console.log(myArray);
console.log(myArr);

let myTuple:[string, number, boolean]=['inchu',2333,true];
console.log(myTuple);

enum colors{
    blue,red,green
}
console.log(colors.green);

enum Color{
    red=10,
    blue,
    green
}
console.log(colors.green);

enum Colors{
    red='Danger',
    blue='Info',
    green='Success'
}
console.log(colors.green);
//by default all the classes are public and one class cannot have multiple constructors and constructor sholud be
//be declared with constructor keyword followed by paranthesis
// class Person{
//     name: string='Poorni';
//     age:number=21;
//     constructor(personName:string, personAge:number){
//         this.name=personName;
//         this.age=personAge;
//     }
// }
// //constructor is called while creating obj
// let person = new Person('Poorni',21);
// console.log(person.name);

class Person{
    constructor(public personName:string,public personAge: number){     
    }
}
let person = new Person('Poorni',21);
console.log(person.personName);

//nullable types
let myname='Poorni';//this is of string type,while creating project,
//it is good practice to create json obj in the begining only.
myname=null;    //we can reintialize it to null only if stirctnullchecks is given as false in tsconfig.json

class Car{
    brand: string='BMW';
    static model: string='x5';
}
let bmwCar=new Car();
console.log(bmwCar.brand);
console.log(Car.model);

class Car1{
    constructor(public brand:string,public model:string){    
    }
}
let cr=new Car1('BMW','x5');
console.log(cr.model);
console.log(cr.brand);

let benz:  Car1={
    brand:'Benz',   
    model:'0002'
}              //we can also create obj in this way
console.log(benz.brand);
console.log(benz.model);

class Person1{
    salary:number=27000;
    constructor(public name:string,public age: number){

    }
}

class Student extends Person1{
    constructor(public sname:string,public sage:number,public USN:number){
        super(sname,sage);//we should declare super with arguments as given in super class otherwise it thow error
    }
}

let person1= new Person1('Dinga',23);
let student=new Student('Dingi',21,9999999);
console.log(person1.salary);
console.log(student.name);
console.log(student.age);

//rectangle.ts    syntax for importing other files


RectangleOperations.Rectangle.area(2,2);
