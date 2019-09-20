namespace RectangleOperations{
    export namespace Rectangle{
        export function area(len:number,br:number){
            console.log("Area of Rectangle is "+len*br);
        }
        export function perimeter(len:number,br:number){
            console.log("Perimetr of Rectangle is "+2*(len*br));
        }
    }
}
// MathOperations.rectangle.area(2,2); if we need to use this in app.ts go n check app.ts
//we can have same namespaces with samename  