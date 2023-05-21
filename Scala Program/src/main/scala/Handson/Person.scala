package Handson

abstract class Person(val name:String, val gender:String) {
  var nationality:String; // abstract field
  def work():Unit; // abstract method
}
