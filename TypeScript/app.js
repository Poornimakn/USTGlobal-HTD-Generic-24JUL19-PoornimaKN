var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var RectangleOperations;
(function (RectangleOperations) {
    var Rectangle;
    (function (Rectangle) {
        function area(len, br) {
            console.log("Area of Rectangle is " + len * br);
        }
        Rectangle.area = area;
        function perimeter(len, br) {
            console.log("Perimetr of Rectangle is " + 2 * (len * br));
        }
        Rectangle.perimeter = perimeter;
    })(Rectangle = RectangleOperations.Rectangle || (RectangleOperations.Rectangle = {}));
})(RectangleOperations || (RectangleOperations = {}));
// MathOperations.rectangle.area(2,2); if we need to use this in app.ts go n check app.ts
//we can have same namespaces with samename  
/// <reference path="./rectangle.ts"/> 
var myName = 'Poorni';
var company;
company = 'UST Global';
company = 23;
console.log(company);
console.log(myName);
var sample;
sample = 10;
sample = true;
console.log(sample);
var myArray = [1234, 'kjd', 'feddfd', true];
var myArr = ['jhs', 'hysdg'];
console.log(myArray);
console.log(myArr);
var myTuple = ['inchu', 2333, true];
console.log(myTuple);
var colors;
(function (colors) {
    colors[colors["blue"] = 0] = "blue";
    colors[colors["red"] = 1] = "red";
    colors[colors["green"] = 2] = "green";
})(colors || (colors = {}));
console.log(colors.green);
var Color;
(function (Color) {
    Color[Color["red"] = 10] = "red";
    Color[Color["blue"] = 11] = "blue";
    Color[Color["green"] = 12] = "green";
})(Color || (Color = {}));
console.log(colors.green);
var Colors;
(function (Colors) {
    Colors["red"] = "Danger";
    Colors["blue"] = "Info";
    Colors["green"] = "Success";
})(Colors || (Colors = {}));
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
var Person = /** @class */ (function () {
    function Person(personName, personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }
    return Person;
}());
var person = new Person('Poorni', 21);
console.log(person.personName);
//nullable types
var myname = 'Poorni'; //this is of string type,while creating project,
//it is good practice to create json obj in the begining only.
myname = null; //we can reintialize it to null only if stirctnullchecks is given as false in tsconfig.json
var Car = /** @class */ (function () {
    function Car() {
        this.brand = 'BMW';
    }
    Car.model = 'x5';
    return Car;
}());
var bmwCar = new Car();
console.log(bmwCar.brand);
console.log(Car.model);
var Car1 = /** @class */ (function () {
    function Car1(brand, model) {
        this.brand = brand;
        this.model = model;
    }
    return Car1;
}());
var cr = new Car1('BMW', 'x5');
console.log(cr.model);
console.log(cr.brand);
var benz = {
    brand: 'Benz',
    model: '0002'
}; //we can also create obj in this way
console.log(benz.brand);
console.log(benz.model);
var Person1 = /** @class */ (function () {
    function Person1(name, age) {
        this.name = name;
        this.age = age;
        this.salary = 27000;
    }
    return Person1;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(sname, sage, USN) {
        var _this = _super.call(this, sname, sage) || this;
        _this.sname = sname;
        _this.sage = sage;
        _this.USN = USN;
        return _this;
    }
    return Student;
}(Person1));
var person1 = new Person1('Dinga', 23);
var student = new Student('Dingi', 21, 9999999);
console.log(person1.salary);
console.log(student.name);
console.log(student.age);
//rectangle.ts    syntax for importing other files
RectangleOperations.Rectangle.area(2, 2);
