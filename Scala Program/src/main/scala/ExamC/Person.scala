package ExamC

class Person (private [ExamC] val name:String, var age:Int, private [ExamC] val gender:Char){

  def printInfo():Unit = {
    print("Name: " + name + ",Age: " + age + " Gender: " + gender + ", ");
  }
}