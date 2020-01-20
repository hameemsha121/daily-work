function add(a,b=1){
    return a+b;
}
console.log(add(4));

function fun1(...params) { 
    console.log(params.length); 
 }  
 fun1();  
 fun1(5); 
 fun1(5, 6, 7);

 var func = function(x,y){ return x*y }; 
function product() { 
   var result; 
   result = func(10,20); 
   console.log("The product : "+result) 
} 
product()

function factorial(num) { 
    if(num<=0) { 
       return 1; 
    } else { 
       return (num * factorial(num-1)  ) 
    } 
 } 
 console.log('factorial is '+factorial(6)) 

//lambda expressions

var foo=(x)=>10+x
console.log(foo(10));

//LAMDA STATEMENT

var msg=()=> {
    console.log("function invoked")
}
msg()

//optional parameters for single parameter for lamda exprssion

var msg=x=>{
    console.log(x)
}
msg(10)

//Immediately invoked function expression 
var main = function() { 
    var loop = function() { 
       for(var x = 0;x<5;x++) {
          console.log(x); 
          console.log("x can not be accessed outside the block scope x value is :"+x);
        } 
    }(); 
     
 } 
 main();

//generator function

function* rainbow() { 
   // the asterisk marks this as a generator 
   yield 'red'; 
   yield 'orange'; 
   yield 'yellow'; 
   yield 'green'; 
   yield 'blue'; 
   yield 'indigo'; 
   yield 'violet'; 
} 
for(let color of rainbow()) { 
   console.log(color); 
} 

function* ask() { 
    const name = yield "What is your name?"; 
    const sport = yield "What is your favorite sport?"; 
    return `${name}'s favorite sport is ${sport}`; 
 }  
 const it = ask(); 
 console.log(it.next()); 
 console.log(it.next('Ethan'));  
 console.log(it.next('Cricket')); 


