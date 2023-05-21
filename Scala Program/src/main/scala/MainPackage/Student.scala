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
