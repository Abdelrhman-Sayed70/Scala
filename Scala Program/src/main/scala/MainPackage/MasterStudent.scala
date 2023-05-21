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
