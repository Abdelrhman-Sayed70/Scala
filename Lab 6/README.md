# Lab 6 | Scala

# Abstract Classes
- Restrict instantiation of super class
- It MUST BE INHERITED (extended) to have a meaning
- IT CAN NEVER BE INSTANTIATED
- Keyword abstract in front of a class

```scala
package Abstraction
abstract class Pet(var name:String) {
  var age:Int = 1;

  val animal:String;    // abstract field
  def printName():Unit; // abstract method

  def printAge():Unit= {
    println(age);
  }
}

class Dog(name:String) extends Pet(name){
  override val animal : String = "Y";

  override def printName(): Unit = {
    print("i am " + name);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var dog = new Dog("dog");
    println(dog.printName());
  }
}
```

# Case Class
- Has only public immutable variables [can not be modifed.]. To modify use copy
- No new keyword
```scala
case class Card(id:Int)

val card = Card(1);
println(card.id)
val card2 = card.copy(2);
print(card2.id)
```

# Traits [Interface]
- Contract
- Similar to interface in jave 
- Scala supports multiple inheritance via traits
- A trait defines some methods and properties that an implementing class should have
```scala
package Traits

trait Vehicle{
  // can contains concrete and abstract fields
  val make:String = ""; // concrete
  var model:String; // abstract

  def move(distance:Int):Unit; // abstract
  def printVehicle():Unit = { // concrete
    print("make: " + make + ", model: " + model);
  }
}

class Car extends Vehicle {
  override var model: String = "bmw";

  override def move(distance:Int): Unit= {
    print("Distance is : " + distance);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var car = new Car;
    car.move(100); 
  }
}
```
# Collections
## `Array` 
```scala
val arr:Array[Int] = new Array[Int](5); // arr of size 5
var arr2:Array[String] = Array("Gaber", "Sayed", "Lime");
print(arr2(0));
```
```scala
val arr:Array[Int] = Array(1,2,3,4);
arr.foreach(println); // 1 2 3 4
val reversedArr = arr.reverse;
reversedArr.foreach(println); // 4 3 2 1
```
```scala
val arr:Array[Int] = Array(4 ,3,2,1);
arr.foreach(println); // 4 3 2 1
val sortedArr = arr.sorted;
sortedArr.foreach(println);  // 1 2 3 4
```
## `List`
```scala
val lst = List(1,4,2);
print(lst(0));
lst(0) = 1 // ERROR
```
```scala
var emptyList:List[Int] = List();
var n = StdIn.readInt();
print("Enter list elements: \n");
while(n > 0){
  var in = StdIn.readInt();
  emptyList = emptyList :+ in;
  n -= 1;
}
emptyList.foreach(println);
```
```scala
var lst:List[Int] = List(1,2,3);
println(lst.head); // 1
var tail = lst.tail;
print(tail) // 2 3
```

## `List & Array`
```scala
val arr: Array[Int] = Array(1, 2, 3);
val lst: List[Int] = List(1, 2, 3);
```

## `List of objects`
```scala
var cars: Array[Car] = new Array[Car](5);
for(i <- 0 to 4){
  cars(i) = new Car(i + 1);
  cars(i).move();
  println()
}
```

## `Map`
```scala
var mp = Map(
   "ml" ->  "a+",
   "concept" -> "a+",
   "algo" -> "a+"
)
mp.keys.foreach(x => println("Key: " + x + " Value: " + mp(x)))
```
```
// output
Key: ml Value: a+
Key: concept Value: a+
Key: algo Value: a+
```

```scala 
var mp = Map("a" -> 1, "b" -> 2);
println(mp.contains("a")); // check if key is exist true
println(mp.get("a")); // get the value of the key 1
```

# Hands on
- Create a person class as an abstract class. the class has two attributes (name and gender). The attributes are constant and cannot be accessed outside the class
- Person class has a primary constructor that takes the name and the gender.
- Person class has an abstract method called work and abstract field nationality
- Create an employee class extends the person class.
- Employee class has a primary constructor that takes name, gender , and empid as a parameters.
- Override the abstract field.
- Override the work function: if the empid equals 1 then print “working”. If it equals 0, print “not working”.
- Create an object of employee and call the work function.


```scala
abstract class Person(val name:String, val gender:String) {
  var nationality:String; // abstract field
  def work():Unit; // abstract method
}

class Employee(name:String, gender:String, var empId:Int) extends Person (name, gender) {
  override var nationality: String = "Egyptian";

  override def work(): Unit = {
    if (empId == 1) {
      print("Working");
    }
    else {
      print("Not Working");
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var employee = new Employee("Lime", "male", 1);
    employee.work();
  }
}
```
