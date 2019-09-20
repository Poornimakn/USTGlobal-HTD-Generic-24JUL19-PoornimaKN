//math Operations 
var MathOperations;
(function (MathOperations) {
    var PI = 3.14;
    function circum(rad) {
        console.log("The Circumference of Circle is " + 2 * PI * rad);
    }
    MathOperations.circum = circum;
    function area(rad) {
        console.log("The Area of Circel is " + PI * rad * rad);
    }
    MathOperations.area = area;
})(MathOperations || (MathOperations = {}));
MathOperations.circum(2.3);
MathOperations.area(21);
