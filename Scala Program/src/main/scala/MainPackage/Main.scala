package MainPackage

import ExamC.Kid
import ExamC.Person

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {

    var kids: List[Kid] = List()

    for (i <- 1 to 2) {
      print("Enter kid" + i + "info:\n");

      print("Kid" + i + " name: ");
      var name: String = StdIn.readLine();

      print("Kid" + i + " age: ");
      var age: Int = StdIn.readInt();

      print("Kid" + i + " gender: ");
      var gender: Char = StdIn.readChar();

      print("Kid" + i + " school name: ");
      var schoolName: String = StdIn.readLine();

      var kid = new Kid(name, age, gender, schoolName);
      kids = kids :+ kid;
    }

    kids.foreach(kid => kid.printInfo());
  }
}

