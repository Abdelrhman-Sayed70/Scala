package Traits

trait MyTrait {
  val make:String = "";
  var model:String; // abstract

  def move(): Unit; // abstract

  def printVehicle():Unit= {
    print("make: " + make + " model: " + model);
  }
}

class Car (var dis:Int) extends MyTrait{
  override var model:String = "bmw";
  override def move(): Unit = {
    print("i move " + dis + "KM");
  }
}
