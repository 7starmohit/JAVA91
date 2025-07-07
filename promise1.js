 let ppromise = ()=>{
   return new Promise((resolve,reject)=>{
      console.log("our promise id got printed...");
      //reject(786);
      resolve(3000)
   })
 }

 let vve = ppromise();
 vve.then((res)=>{
   console.log("is is got sucess" + res );
 });

 vve.catch((err)=>{
   console.log("it is got an error"+ err);
 });
