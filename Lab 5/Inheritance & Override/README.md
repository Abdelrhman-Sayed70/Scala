# Inheritance & Override

## `Inheritance simplest form`
```scala
package Inheritance

class Polygon {
  protected var area: Double = 0.0;

  def printArea(): Unit = {
    print(area);
  }
}

class Rectangle extends Polygon {

}

class Triangle extends Polygon {

}

object Main {
  def main(args: Array[String]): Unit = {
    var rectangle = new Rectangle();
    rectangle.printArea(); //0 -> value come from super class
  }
}
```

## `Sub-class params & Override`
```scala
package Inheritance

class Polygon {
  protected var area: Double = 0.0;

  def printArea(): Unit = {
    println("Polygon area: " + area);
  }
}

class Rectangle(var w:Int, var h:Int) extends Polygon {

  override def printArea(): Unit = {
    println("Rectangle area: " + w * h);
  }
}

class Triangle(var a:Int, var b:Int, var c:Int) extends Polygon {

  override def printArea(): Unit = {
    println("Triangle area: " + a * b * c);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var rectangle = new Rectangle(2,3);
    var triangle = new Triangle(2,2,3);
    rectangle.printArea();// Rectangle area: 6
    triangle.printArea(); // Triangle area: 12
  }
}
```
## `Super class params & Sub class param`
```scala
package Inheritance

class Car (val id:Int, model:String) {
  def this(model: String) = {
    this(0, model);
  }

  def moveAction():Unit = {
    print("Car is moving for 100 km");
  }
}

class DieselCar (id:Int, model:String, var dieselDistance:Int) extends Car(id, model) {
  // constructor contains all super class variables without [var-val] and contains also its variable [var dieselDistance:Int]
  // extends class (id, model): super class constructor values only without [var-val]

  override def moveAction(): Unit = {
    println("Diesel Car is moving for " + dieselDistance);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var car = new Car(1, "BMW");
    var dieselCar = new DieselCar(2,"Diesel", 500);
    dieselCar.moveAction();
  }
}
```
## Constructors 
```scala
package Inheritance

class Student(val name:String, val id:Int) {
  private [Inheritance] var age:Int = 0 ;

  def this(name:String, id:Int, age:Int) = {
    this(name, id);
    this.age = age;
  }

  def getStudentInfo():Unit = {
    println("name: " + name + "\nid: " + id);
  }
}

class MasterStudent(name:String, id:Int) extends Student(name,id){
  def this(name:String, id:Int, age:Int) = {
    this(name, id);
    this.age = age;
  }

  override def getStudentInfo(): Unit = {
    println("Master Student") ;
    super.getStudentInfo();
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var masterStudent = new MasterStudent("ali", 1, 20);
    masterStudent.getStudentInfo();
  }
}
```
