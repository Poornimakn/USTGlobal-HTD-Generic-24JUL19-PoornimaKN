var MathOperations;
(function (MathOperations) {
    var rectangle;
    (function (rectangle) {
        function area(len, br) {
            console.log("Area of Rectangle is " + len * br);
        }
        rectangle.area = area;
        function perimeter(len, br) {
            console.log("Perimetr of Rectangle is " + 2 * (len * br));
        }
        rectangle.perimeter = perimeter;
    })(rectangle = MathOperations.rectangle || (MathOperations.rectangle = {}));
})(MathOperations || (MathOperations = {}));
// MathOperations.rectangle.area(2,2); if we need to use this in app.ts go n check app.ts
