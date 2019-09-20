class Person2{
constructor(public name:string,public age:number,public degree ?: string){// ? is used to specify optional field means its not mandatory
    }
}

let person2:Person2={
    name:'poo',
    age:34
}

let person3:Person2={
    name:'xyz',
    age:22,
    degree:'Eng'
}
console.log(person3.name);

interface Student1{
    name:string;
    age:number;
    printDetails():void;
}
class Person4 implements Student1{
    salary: number;
    name='inchu';
    age=19;
    printDetails()
    {
        console.log("Name is "+this.name+ " and  Age is "+this.age)
    }
}
let person4= new Person4();
person4.printDetails();

let student1: Student1={
    name:'lux',
    age:60,
    printDetails:()=>{
        console.log('Name is '+student1.name+' and Age is '+student1.age);
    }
}
student1.printDetails();

//Generics

function getArray<p>(items:p[]):p[]{
    return new Array<p>().concat(items);
}

let strArray=getArray<string>(['poo','hjadg','liasjdk']);
// strArray.push(123); it will throw error cz we have declared strArray as string so we cant pass other datatypes
strArray.push('radha');

let numArray=getArray<number>([123,123,111]);
// numArray.push('hjdg');
numArray.push(9867);

console.log(numArray);

