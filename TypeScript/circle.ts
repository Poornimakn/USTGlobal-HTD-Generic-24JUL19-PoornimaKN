//math Operations namespace- for code seperation purpose

namespace MathOperations{//namespace keyword should make use of function
    const PI=3.14;
    export function circum(rad:number){//we should export
        console.log("The Circumference of Circle is "+2*PI*rad);
    }
    export function area(rad:number){//if we dont give export the it will throw error cz without export its value cant be used 
        console.log("The Area of Circel is "+PI*rad*rad);
    }
}
MathOperations.circum(2.3);
MathOperations.area(21);

//export to use func outside that namespace