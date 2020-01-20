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


var a=new Array(4)
for(var i=0;i<a.length;i++)
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
//          -->2.every
//          -->3.filter
//          -->4.forEach----
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




