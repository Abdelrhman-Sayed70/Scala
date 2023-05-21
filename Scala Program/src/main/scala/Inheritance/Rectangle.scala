package Inheritance

class Rectangle(var w:Int, var h:Int) extends Polygon {

  override def printArea(): Unit = {
    println("Rectangle area: " + w * h);
  }
}
