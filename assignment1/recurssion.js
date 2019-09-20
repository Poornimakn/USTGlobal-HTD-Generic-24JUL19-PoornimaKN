
function fact(num){
    if(num===0||num===1)
    {
        return 1;
    }
    else
    {
        return fact(num-1)*num;
    }
}
let factvalue=fact(5);
console.log(factvalue)

        