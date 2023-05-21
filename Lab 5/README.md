# Lab 5 | Scala
# Pattern Matching
```scala
var x = 1;
var res = x match {
  case 1 => "One"
  case 2 => "Tow"
  case _ => "Default"
}
print(res); // One
```
```scala
def main(args: Array[String]): Unit = {
  print(TestMatch(5)); // Default
}
def TestMatch(x:Int):String = {
  x match {
    case 1 => "One"
    case 2 => "Tow"
    case _ => "Default"
  }
}
```
```scala
var x = StdIn.readInt();
var ans = x match {
  case n if (n % 2 == 0) => "Even";
  case n if (n % 2 != 0) => "Odd";
}
print(ans); // the same value of x
```

# Classes
### `Create simple class with params`
```scala
class student(var id:Int, var name:String);
object Main {
  def main(args: Array[String]): Unit = {
    var stud = new student(1, "Gaber");
    stud.name = "Ahmed";
    print(stud.name); // Ahmed
  }
}
```
### `Constructors`
```scala
class Student(val id:Int, var name:String){
  def this() = {
    this(0, "Gaber")
  }
  def this(name:String) = {
    this(0, name);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var s1 = new Student();
    var s2 = new Student("Ahmed");
    var s3 = new Student(0,"Ahmed");
  }
}
```
### `Getters & Setters`
```
- val -> has getter only
- var -> has getter and setter
- none -> has no getter or setter
```
```scala
import scala.io.StdIn

class User(private val name:String, var age:Int, weird:Char) {
  def this(name: String) = {
    this(name, 1, 'N');
  }

  def printName(): Unit = {
    print(this.name);
  }

  // Getter & Setter [var age]
  def setAge(age: Int): Unit = {
    this.age = age;
  }

  def getAge(): Int = {
    return this.age;
  }

  // Getter [val name]
  def getName(): String = {
    return this.name;
  }

  // No Getter or Setter for weird

}

object Main {
  def main(args: Array[String]): Unit = {
    var user = new User("ahmed", 10, 'Y');
    print(user.getAge()); // 10
  }
}
```
 


# Hands on
- Create Student Class in new scala class file
  - Create constructor in the header initializing name as constant and ID as constant
  - Create a field inside the class for the age (no one outside the package can access)
  - Create 1 more constructors accepts all: name, ID, age
  - Create an instance method ( studentInfo() )
    to display all information name and ID
    
- Create MasterStudent Class that inherits Student Class
   - Create 1 more constructors accepts all: name, ID, age
   - Override studentInfo() to display “Master Student”

- Main function: Create object of MasterStudent and call studentInfo()


```scala
package MainPackage
object Main {
  def main(args: Array[String]): Unit = {
    var masterStudent = new MasterStudent("Gaber", 1, 20);
    masterStudent.studentInfo();
  }
}

package MainPackage
class Student(val name:String, val Id:Int) {
  private[MainPackage] var age: Int = 0;

  def this(name: String, Id: Int, age: Int) = {
    this(name, Id);
    this.age = age;
  }

  def studentInfo(): Unit = {
    println("name: " + name + ", Id: " + Id);
  }
}

package MainPackage
class MasterStudent (name:String, Id:Int) extends Student(name, Id){
  def this(name:String, Id:Int, age:Int) = {
    this(name, Id);
    this.age = age;
  }

  override def studentInfo(): Unit = {
    println("Master Student");
    super.studentInfo()
  }
}
```



