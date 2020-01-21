//simple array

var alphas;
alphas=["1","2","3","4"]
console.log(alphas[0]);
console.log(alphas[3]);


//single statement declaration and initialization

var nums=[1,2,3,4]
console.log(nums[0]);
console.log(nums[1]);
console.log(nums[3]);

//array object


var a=new Array()
for(var i=0;i<10;i++)
{
    a[i]=i*2
    console.log(a[i]);
}

//array constructors accepting CSV

var b=new Array("a","b","c")
for(var j=0;j<b.length;j++)
{
    console.log(b[j]);
}

//ARRAY METHODS
//          -->1.concat()//a.concat(b)
//          -->2.every----->returns true if every possible elements satisfy the condition
//          -->3.filter----->creates a new array with all of the elements of this array for which the provided filtering function returns true
//          -->4.forEach---->calls a function for each element in the array
//          -->5.indexof
//          -->6.join---->returns a string after joining all the array elemnts
//          -->7.lastIndexOf---------->
//          -->8.map------->create a new array with mapping
//          -->9.pop------->pop last element
//          -->10.push------>add to end
//          -->11.reduce----->left to right(single value is returned)like sum
//          -->12.reduceRight------> right to left(single value is returned) like sum
//          -->13.reverse()---->reverses
//          -->14.shift()----->removes first element and returns that element
//          -->15.slice()----->begin and end
//          -->16.some()------->boolean array.some(callback[,thisObject])
//          -->17.toSource()
//          -->18.sort()------>sort elements
//          -->19.splice-------->add or remove elements----a.splice(2,0,water)//after 2,water 
//          -->20.toString------>String array returned
//          -->21.unshift------->adds one or more to the end or begining and returns the length


//forEach

var nums=new Array(12,13,14,15)
console.log('printing original array....')

nums.forEach(function(val,index){
    console.log(val);
})
nums.reverse()
console.log('printing reversed array.....');
nums.forEach(function(val,index){
    console.log(val);
})


//every
function isBigEnough(element,index,array){
    return (element>=10)
}

var passed=[12,5,8,130,44].every(isBigEnough);
console.log(passed);


//filter
function isBigEnough2(element,index,array){
    return (element>=10)
}

var passed=[12,5,8,130,44].filter(isBigEnough2);
console.log(passed);

//

//filter

function isdividedby(element,index,array){
    if(element%2==0 && element%5==0)
    {
        return element;
    }
    else return 0
}
var p=new Array(10);
for(let index=0;index<p.length;index++)
{
    p[index]=Math.floor(Math.random()*100)
    console.log(p[index]);
}

var a=p.filter(isdividedby)
console.log(a);

//map

var b=p.map((x)=>Math.ceil(x*1.1))
console.log(b);

//filter

var c=p.filter((x)=>x%2==0 && x%5==0)
console.log(c);