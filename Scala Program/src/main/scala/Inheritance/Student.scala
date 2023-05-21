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
