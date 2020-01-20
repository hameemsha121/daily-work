test()
//const ==cant change
let name='amit'
name='Rahul'
//problems
//1.same variable can be declared more than one time
//2.The scope of the var keyword is function scope not block scope(c,c++,java)
//3.Allows function call first and declare then----this concept is called hoisting of variables or functions
//4.
function test(){
   for(let index=0;index<5;index++){
         console.log('Index : '+index);
         var name='raghu'
   }
    
     console.log(index);
    

// console.log('value of index :'+index)
// console.log(name);
}
//IMPORTANT
//let and const keyword----> these are block scoped

