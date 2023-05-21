# `Scala | Exam C`
- Create a package that contains the following two classes:
  - Create person class that has:
    - Primary parametrized constructor that takes 3 parameters. Name as a string. Age as an integer, and gender as a char. to set the attributes values    
    - Name and gender are immutable variables and can be accessed inside the package only.
    - printInfo function that prints all the person info.


  - Create Kid class that inherit the person class. The kid class has:
    - primary constructor that takes 4 parameters, name as a string age as an integer, gender as a char, and schoolName as a string.
    - printInfo function that prints all the kid info.

- Main
  - Create 2 objects of kid class by reading the objects data from the user. 
  - Add the objects in the list.
  - Call the printInfo function in each element of the list using one of the built-in high order functions. 

# `Scala | Exam C - Solution`
```scala
package ExamC

class Person (private [ExamC] val name:String, var age:Int, private [ExamC] val gender:Char){

  def printInfo():Unit = {
    print("Name: " + name + ",Age: " + age + " Gender: " + gender + ", ");
  }
}
```
```scala
package ExamC

class Kid(name:String, age:Int, gender:Char, var schoolName:String) extends Person(name, age, gender) {
  override def printInfo():Unit = {
    super.printInfo();
    println(" Child School Name: " + schoolName);
  }
}
```
```scala
package MainPackage

import ExamC.Kid
import ExamC.Person

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {

    var kids: List[Kid] = List()

    for (i <- 1 to 2) {
      print("Enter kid" + i + "info:\n");

      print("Kid" + i + " name: ");
      var name: String = StdIn.readLine();

      print("Kid" + i + " age: ");
      var age: Int = StdIn.readInt();

      print("Kid" + i + " gender: ");
      var gender: Char = StdIn.readChar();

      print("Kid" + i + " school name: ");
      var schoolName: String = StdIn.readLine();

      var kid = new Kid(name, age, gender, schoolName);
      kids = kids :+ kid;
    }
    
    kids.foreach(kid => kid.printInfo());
  }
}


```
