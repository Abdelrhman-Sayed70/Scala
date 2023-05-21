# Lab 2 - Scala

## Define Variables
Mutable variables: `var varname:datatype = initial value` <br>
Immutable variables:  `val varname:datatype = initial value` 
```scala
var x:Int = 10;
var floatNumber:Float = 1.1f;
val PI:Double = 3.14;
var str:String = "ali";
var item = 10;
print(item);
```
## Expresions
```scala
var x:Int = {var n1 = 5; var n2 = 3; n1+n2};
print(x);
```

## Functions
def mthdName(params):return type= { body }
```cpp
def greeting(str:String):Unit = {
  print("Hi "+ str );
}
def main(args: Array[String]): Unit = {
  greeting("Gaber");
}
```

## Excercise 1
`Create calculator function`
```scala
import scala.io.StdIn;
object Main{
  def calculator(n1:Float, n2:Float, op:Char):Float={
    if (op == '+') {return n1 + n2;}
    else if (op == '-') {return n1 - n2;}
    else if (op == '*') {return n1 * n2;}
    else {
      if (n2 == 0) {throw new Exception("Error!! Divide by 0.");}
      return n1 / n2;
    }
  }
  def main(args: Array[String]): Unit = {
    var n1:Float = 0f;
    var n2:Float = 0f;
    var op:Char = 'a';
    print("Enter first num: ");
    n1 = StdIn.readFloat();
    print("Enter second num: ");
    n2 = StdIn.readFloat();
    print("Enter operator: ");
    op = StdIn.readChar();
    print(calculator(n1 ,n2, op));
  }
}
```
## Create Class
```scala
import scala.io.StdIn;
object Main{
  def main(args: Array[String]): Unit = {
    var obj = new MyFirstClass();
    obj.greeting("Gaber")
  }
}
class MyFirstClass{
  def greeting(str:String):Unit = {
    print("Hello " + "Gaber") ;
  }
}
```

## Excercise 2
- Write a Scala program to check two given integers and return true if one of them is greater than 30 or if their sum is greater than 30. check function should be created inside   an object named checkObject
- Create the main in another object without writing main function explicitly
- Read two numbers and pass them to the check function and print the output.

```scala
import scala.io.StdIn

object starter extends App {
  print("Enter 2 numbers: ")
  var num1 = StdIn.readInt()
  var num2 = StdIn.readInt()
  var res:Boolean = checkObject.check(num1 ,num2)
  print(res)
}

object checkObject {
  def check(n1:Int, n2:Int):Boolean={
    return (n1>30 || n2>30 || n1+n2>30)
  }
}

```

## HandsOn
- Write a Scala program to check whether two given integers are in the range 40..50 inclusive, or they are both in the range 60..70 inclusive
- Define a function in a new object that checks both numbers and return one of these two strings.
- If both numbers are not within one of the given ranges, throw an exception.

```scala
import scala.io.StdIn;
object Main{
  def main(args: Array[String]): Unit = {
      var n1:Int = StdIn.readInt();
      var n2:Int = StdIn.readInt();
      checker.check(n1,n2);
  }
}
object checker {
  def check(n1:Int, n2:Int): Unit = {
    if (n1>= 40 && n1<=50 && n2>= 40 && n2<=50){print("In range 40..50");}
    else if (n1>= 60 && n1<=70 && n2>= 60 && n2<=70) {print("In range 60..70");}
    else {throw new Exception("Error")}
  }
}
```

