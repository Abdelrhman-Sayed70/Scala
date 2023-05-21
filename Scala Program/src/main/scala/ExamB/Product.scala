package ExamB

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
