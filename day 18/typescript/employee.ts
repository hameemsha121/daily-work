export class Employee // export is used to get this class imported in some other
{
    empid:number;
    empname:string;
    dob:Date;
    constructor(id:number,name:string,d:Date){
        this.empid=id;
        this.empname=name;
        this.dob=d;
    }

    get(){
        return "Hello " + this.empname;
    }

}

let a=new Employee(101,'Rohit',new Date());
console.log(a.dob);
console.log(a.get());
