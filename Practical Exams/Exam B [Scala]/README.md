#  `Scala | Exam B` 
- Create a priceFunctions trait that contains:
  - An abstract function named calculate Price.
- Create a product class that implements priceFunctions trait and has: 
  - A primary constructor that takes two parameters, namely name as a string, price as a float. The attributes can be accessed in the subclasses only.
  - An attribute named quantity. Its initial value equals 1.
  - An auxiliary constructor that takes three parameters, namely name as a string. price as a float, and quantity as an integer.
  - calculatePrice function that returns the total price of the of the quantity.
- Main
  - Create 3 objects of product class using the auxiliary constructor after reading the object data from the user.
  - Call calculatePrice function and print the output if the price exceed 1500.   


#  `Scala | Exam B - Solution`
```scala
trait PriceFunctions {
  def calculatePrice(): Float; // abstract
}
```
```scala
class Product(protected var name:String,protected var price:Float) extends PriceFunctions {
  private var quantity:Int = -1;

  def this(name:String, price:Float, quantity:Int) {
    this(name,price);
    this.quantity = quantity;
  }

  override def calculatePrice(): Float = {
    return quantity * price;
  }
}
```
```scala
object Main {
  def main(args: Array[String]): Unit = {
    var product1 = new Product("car", 100, 100);
    var product2 = new Product("mobile", 5, 100);
    var product3 = new Product("Pen", 2, 1000);

    var products = List(product1,product2,product3);
    products.foreach(x => if (x.calculatePrice() > 1500) println(x.calculatePrice()));
    // or
    var filtredProducts = products.filter(p => p.calculatePrice() >= 1500);
    filtredProducts.foreach(p => println(p.calculatePrice()));
  }
}
```
