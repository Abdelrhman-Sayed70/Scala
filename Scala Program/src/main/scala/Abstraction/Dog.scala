package Abstraction

class Dog(name:String) extends Pet(name){
  override val animal : String = "Y";

  override def printName(): Unit = {
    print("i am " + name);
  }
}
