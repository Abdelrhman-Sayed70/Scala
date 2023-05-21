package Inheritance

class Triangle(var a:Int, var b:Int, var c:Int) extends Polygon {

  override def printArea(): Unit = {
    println("Triangle area: " + a * b * c);
  }
}
