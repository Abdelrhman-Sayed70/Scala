package Inheritance

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
