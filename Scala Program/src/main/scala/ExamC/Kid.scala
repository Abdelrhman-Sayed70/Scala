package ExamC

class Kid(name:String, age:Int, gender:Char, var schoolName:String) extends Person(name, age, gender) {
  override def printInfo():Unit = {
    super.printInfo();
    println(" Child School Name: " + schoolName);
  }
}
