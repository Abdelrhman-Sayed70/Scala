package Inheritance

class Car (val id:Int, model:String) {
  def this(model: String) = {
    this(0, model);
  }

  def moveAction():Unit = {
    print("Car is moving for 100 km");
  }
}
