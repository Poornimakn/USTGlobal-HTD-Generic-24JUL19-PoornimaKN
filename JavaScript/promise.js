let result=new Promise(function(resolve,reject)
{
    if(10===10)
    {
        reject('Failed');// if we comment this it will be in pending state, control/ to comment lines
    }
    else
    {
        resolve('Success');// if we comment this it will be in pending state
    }
});
result.then((data)=>//arrow func or result.then(function(data))
{
    console.log('Then block ='+data);
}).catch((error)=>{
    console.log('Catch block='+error);
});

let emp=new Promise(function(resolve,reject)
{
    const emp=[ {name:'Shahrukh',
                age: 60},
                {name:'Sundari',
                age:25},
                {name:'Akshay',
                age:50}]
    if(10>10)
    {
        reject('Failed');// if we comment this it will be in pending state
    }
    else
    {
        resolve(emp);// if we comment this it will be in pending state
    }
});
emp.then((data)=>//arrow func or result.then(function(data))
{
    //console.log('Employee Data=',data);//if we use concatenation operator it will give object,object,object not the data so use comma
    return data;//if we return this it will go to another then block
}).catch((error)=>{
    console.log('Catch block='+error);
}).then(function(data1){
    console.log('This is the block 2',data1);
})