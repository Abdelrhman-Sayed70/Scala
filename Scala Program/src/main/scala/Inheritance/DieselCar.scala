package Inheritance

class DieselCar (id:Int, model:String, var dieselDistance:Int) extends Car(id, model) {
  // constructor contains all super class variables without [var-val] and contains also its variable [var id:Int]
  // extends class (make, model): super class constructor values only without [var-val]

  override def moveAction(): Unit = {
    println("Diesel Car is moving for " + dieselDistance);
  }
}
