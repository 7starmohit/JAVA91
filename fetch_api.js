const facts = "https://datausa.io/api/data?drilldowns=Nation&measures=Population";
/*
const getfacts = async() =>{
    console.log("you data is getting ready....");
    let response = await fetch(facts);
    console.log(response); 
    let fw = await response.json();
    console.log(fw);    
}*/

function getfacts(){
    fetch(facts).then((response)=>{
        return response.json();
    }).then((data)=>{
        console.log(data);
    });
}
