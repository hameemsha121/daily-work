//Template Literals

var name='brenden';
console.log(`Hello,${name}!`)// use backticks

//template literals and expression

var a=10
var b=15
console.log(`The sum of ${a} and ${b} is ${a+b}`)

//template literals and function expression

function fn(){return "Hello world"}
console.log(`Message:${fn()}!`);

//Multiline Strings

var multiline=`This is
a code with
multiple
lines`
console.log(multiline);


//String.raw
        //-->enables us to write the backslash as we would in a regular expression literal
    
    
    var text= String.raw `hello \n world`
    console.log(text);


    console.log(String.fromCodePoint(65));//returning the ASCII equivalent of the number

