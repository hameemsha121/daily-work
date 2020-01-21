class Hello {

    constructor(fname, lname, age) {
        this.fn = fname;
        this.ln = lname;
        this.a = age;
    }

    full_name() {
        return this.fn + '' + this.ln
    }


}

let a = new Hello('hameem', 'sha', '24')
console.log(a.full_name());


class Polygon {
    constructor(height, width) {
        this.h = height;
        this.w = width;
    }
    test() {
        console.log(this.h);
        console.log(this.w);
    }
}


var z = new Polygon(10, 20);
z.test();

class StaticMem {
    static disp() {
        console.log('static function called');
    }
}

StaticMem.disp()




//instance of operator

class Person {}
var obj = new Person()
var isPerson = obj instanceof Person;
console.log('obj instance of person ' + isPerson);


//class inheritance


class Shape {
    constructor(a) {
        this.Area = a
    }
}
class Circle extends Shape {
    disp() {
        console.log('Area of the circle: ' + this.Area);
    }
}

var obj = new Circle(223)
obj.disp()

//multilevel inheritence

class Root {
    test() {
        console.log("call from parent class")
    }
}
class Child extends Root {};
class Leaf extends Child {}

//indirectly inherits from Root by virtue of inheritance

var obj = new Leaf();
obj.test();


//Method Overriding

class PrinterClass {
    doPrint() {
        console.log("doPrint() from Parent called… ");
    }
}
class StringPrinter extends PrinterClass {
    doPrint() {
        super.doPrint();
        console.log("doPrint() is printing a string…");
    }
}
var obj = new StringPrinter();
obj.doPrint();