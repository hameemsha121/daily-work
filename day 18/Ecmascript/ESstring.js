
var val= new String("hameem");
console.log(val)
console.log(val.length);



//properties -->constructor
//           -->length
//           --> prototype


var str=new String("aaaa")
console.log(str.constructor);

//object prototype

function employee(id,name){
    this.id=id;
    this.name=name;
}

var emp=new employee(132,"smith");
employee.prototype.email="smith@abc.com"

console.log(emp.id);
console.log(emp.name);
console.log(emp.email);

//string methods
//      -->1.charAt
//      -->2.charCodeAt
//      -->3.concat
//      -->4.indexOf
//      -->5.lastIndexOf
//      -->6.localeCompare 
//      -->7.match //matching with regular expression
//      -->8.replace    
//      -->9.search 
//      -->10.toLowerCase
//      -->11.toUpperCase
//      -->12.valueOf
//      -->13.toString
//      -->14.split
//      -->15.slice(3,-2)
//      -->16.substring
//              

var str="all indians are my brothers and sisters"

console.log(str.substring(3,12))
console.log(str.slice(3,-3));
console.log(str.toUpperCase());
