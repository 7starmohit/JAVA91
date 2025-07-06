class udemy{
    constructor (sigma){
        this.sigma=sigma;
        console.log("hey"+ sigma);
    }
 }

 class football extends udemy{
    constructor(sigma){
        super(sigma);
        this.sigma = sigma;
        console.log("hey bunny" + sigma);
    }
 }

 let h1 = new football("basket");
