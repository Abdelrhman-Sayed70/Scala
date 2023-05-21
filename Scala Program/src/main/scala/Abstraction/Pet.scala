package Abstraction

abstract class Pet(var name:String) {
  var age:Int = 1;

  val animal:String;    // abstract field
  def printName():Unit; // abstract method

  def printAge():Unit= {
    println(age);
  }

}
