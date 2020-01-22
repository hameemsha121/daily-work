
interface IPerson { 
    firstName:string, 
    lastName:string, 
    sayHi: ()=>string 
 } 
 
 var customer:IPerson = { 
    firstName:"Tom",
    lastName:"Hanks", 
    sayHi: ():string =>{return "Hi there"} 
 } 
 
 console.log("Customer Object ") 
 console.log(customer.firstName) 
 console.log(customer.lastName) 
 console.log(customer.sayHi())  
 
 var employee:IPerson = { 
    firstName:"Jim",
    lastName:"Blakes", 
    sayHi: ():string =>{return "Hello!!!"} 
 } 
   
 console.log("Employee  Object ") 
 console.log(employee.firstName);
 console.log(employee.lastName);


 interface Person { 
    age:number 
 } 
 
 interface Musician extends Person { 
    instrument:string 
 } 
 
 var drummer = <Musician>{}; 
 drummer.age = 27 
 drummer.instrument = "Drums" 
 console.log("Age:  "+drummer.age) ;
 console.log("Instrument:  "+drummer.instrument)