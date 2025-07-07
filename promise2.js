 asynsc1 = ()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("data1 ...");
            resolve(404);
        },4000);
       
    });
 }


 asynsc2 = ()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("data2 ...");
            resolve(505);
        },4000);
        
    });
 } 

 console.log("fetching data1....");
 let f1 = asynsc1();
 f1.then((res)=>{
    console.log(res);
    console.log("fetching data2...");
    let s1 = asynsc2();
    s1.then((ses)=>{
        console.log(ses);
    });
 });
