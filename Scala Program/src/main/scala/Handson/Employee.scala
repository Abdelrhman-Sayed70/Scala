package Handson

class Employee(name:String, gender:String, var empId:Int) extends Person (name, gender) {
  override var nationality: String = "Egyptian";

  override def work(): Unit = {
    if (empId == 1) {
      print("Working");
    }
    else {
      print("Not Working");
    }
  }
}