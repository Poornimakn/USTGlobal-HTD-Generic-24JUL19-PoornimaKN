function printConstructor(cons: Function){ //function type is responsible for class
    console.log(cons); 
}
@printConstructor
class Sample{
    constructor(){
        console.log('This is Sample Class Constructor');
    }
}