# Quizzes 

## `Quiz 1` 
Get the longest string from list using only higher order function. Given list ["Ahmed", "Mona", "Mohammed"] the output is `Mohammed`
```scala
var lst = List("Ahmed", "Ali", "Mohammed", "GG");
var str = lst.reduce((ans, name) =>
  if (ans.length < name.length) name else ans
)
print(str)
```

## `Quiz 2`
Get prime numbers in list using Higher function 
```scala
def isprime(n:Int):Boolean={
  for(i<-2 until n){
     if (n%i == 0) {return false;}
  }
  return true;
}
def main(args: Array[String]): Unit = {
  var lst = List(5,4,6,11,19,20) ;
  var ans = lst.filter(x => isprime(x));
  print(ans); 
}
```
## `Quiz 3`
Given n1 and n2 print the square of all numbers between them using Higher order function 
```scala
import scala.io.StdIn;
def pow(n:Int):Int = { n * n;}
def main(args: Array[String]): Unit = {
  var n1:Int = StdIn.readInt();
  var n2:Int = StdIn.readInt();
  var lst = Range(n1, n2+1);
  var ans = lst.map(pow);
  print(ans);
}
```
```scala
var n1:Int = StdIn.readInt();
var n2:Int = StdIn.readInt();
var lst = Range(n1, n2+1);
var ans = lst.map(x => x * x);
print(ans);
```

## `Quiz 4`
- Create Isprime function that take number and function CountDivisors. the function return "prime" or "not prime". It should be higher order function
- countDivisors is function that take int n and return number of its divisors
```scala
import scala.io.StdIn;
object Main{
  def CountDivisors(n:Int):Int = {
    var cnt:Int = 0;
    for(i<-1 to n){
       if (n%i == 0) {cnt += 1;}
    }
    return cnt;
  }
  def IsPrime(n:Int, fun:(Int) => Int):String= {
    if (n < 2 || fun(n) > 2) {
      return "Not prime";
    }
    return "Prime";
  }
  def main(args: Array[String]): Unit = {
    var n:Int= StdIn.readInt();
    print(IsPrime(n, CountDivisors));
  }
}
```
## `Quiz 5`
- Given a list print the min number using anon function 
```scala
var lst = List(5,4,2,1,3);
var mn = lst.reduce((ans, num)=> if (num<ans) num else ans);
print(mn);
```

## `Quiz 6` 
- Check function that take string and check if the first char is 'm' 
- Test higher order function takes a string and check function 
- Allow the user to enter any number of strings that he can and apply Test function on this string

```scala
import scala.io.StdIn
import scala.util.control.Breaks.break;
object Main{
  def Check(str:String):Boolean = {
    return (str.charAt(0) == 'm');
  }
  def Test(str:String, fun:(String)=>Boolean):Boolean={
      return fun(str);
  }
  def main(args: Array[String]): Unit = {
    print("Do you need to enter string? ")
    var ch:Char = StdIn.readChar();
    while(ch != 'n'){
      print("Enter String: ");
      var str:String = StdIn.readLine();
      println(Test(str, Check));
      print("Do you need to enter string? ")
      ch = StdIn.readChar();
    }
  }
}
```
