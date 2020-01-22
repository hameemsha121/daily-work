"use strict";
exports.__esModule = true;
var Employee // export is used to get this class imported in some other
 = /** @class */ (function () {
    function Employee(id, name, d) {
        this.empid = id;
        this.empname = name;
        this.dob = d;
    }
    Employee.prototype.get = function () {
        return "Hello " + this.empname;
    };
    return Employee;
}());
exports.Employee = Employee;
var a = new Employee(101, 'Rohit', new Date());
console.log(a.dob);
console.log(a.get());
