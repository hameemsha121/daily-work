function add(p:string, q:string):string;
function  add(x:number,y:number):number;

function add(a:any,b:any):any{
    return a+b;
}

var z=add("typescript"," kollaam");
console.log(z);

var e=add(10,20)
console.log(e);


var g=[1,3,5,7];
g.push(10);
console.log(g);
g.pop();
console.log(g);


// var d=add("typescript",100);
// console.log(d);



