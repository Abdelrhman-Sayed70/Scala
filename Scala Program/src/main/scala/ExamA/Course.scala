package ExamA

class Course (private var name:String, private var grade:Int){
  def this(name:String) = {
    this(name,0);
  }
  def getGrade():Int = {
    return grade;
  }
  def displayInfo():Unit = {
    println("Course name: " + name + ", and Course grade: " + grade);
  }
}