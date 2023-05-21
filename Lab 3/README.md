# Lab 3 - Scala

## Loops
```scala
for(a<-1 to 4){
  println(a);
}
// 1 2 3 4
```
```scala
for(a<-1 until  4){
  println(a);
}
// 1 2 3
```
```scala
// Nested Loop
for(i<-1 to 3; j<-1 to 3){
  println("i: " + i)
  println("j: " + j);
}
```

## List
```scala
// Create and print List
var lst = List(1,2,3,4);
for(it <- lst){
  println(it);
}
```
```scala
// Filter from List
var lst = List(1,2,3,4);
for(i<- lst; if i%2==0){
  println(i)
}
```
```scala
val numbers = Range(1, 10)
// 1 9

```
## Function 
```scala
def fun(n:Int, m:Int): Unit = {
  print("n: " + n + "\nm: " + m);
}
def main(args: Array[String]): Unit = {
  fun(m=1, n=4);
}
```

## Anonumus function 
```scala
var anonfun = (a:Int, b:Int) => { a+b; }
print(anonfun(7,2));
```
```scala
var str = (str1:String, str2:String) => {str1+str2}
print(str("Abdo ", "Gaber"))
```

## High Order Function [Function is param]
```scala
def sq(n:Int):Int= {n*n;}
def calc(n:Int, fun:(Int)=>Int):Int={fun(n);}
def main(args: Array[String]): Unit = {
  print(calc(5, sq));
}
```
```scala
def sumUp(n:Int, m:Int):Int = { n+m ;}
def calc(n:Int, m:Int, fun:(Int,Int)=>Int):Int={fun(n,m);}
def main(args: Array[String]): Unit = {
    print(calc(1,2,sumUp));
}
```
```scala
def printing(n:Int): Unit = { print(n);}
def fn(n:Int, fun:(Int)=>Unit):Unit = {fun(n);}
def main(args: Array[String]): Unit = {
     fn(5,printing);
}
```
## Popular High Order Function 
### `Map`
Map is a function that transforms one collection into another collection.
```scala
var nums = Range(1, 5);
var lst = nums.map(x => x*x);
lst.foreach(println);
```
### `foreach`
```scala
var lst = List(1,2,3,4);
lst.foreach(num => println(num*num)); // Lambda function
```
```scala
def fun(n:Int):Unit={println((n*n));}
def main(args: Array[String]): Unit = {
  var nums = Range(1, 5);
  nums.foreach(fun);
}
```
### `Filter` 
```scala
var names = List("Gaber", "Ahmed", "Abdo", "Mohamed");
var lst = names.filter(it => it.size >= 5);
lst.foreach(println);
```
### `Reduce`
`Sum up all list elements. Output is variable`
```scala
var names = List("Gaber", "Ahmed", "Abdo", "Mohamed");  
var str = names.reduce((cum, name) => cum + " " + name);
print(str); // Gaber Ahmed Abdo Mohamed 
```
```scala
var names = List ("Abdo", "Sayed", "Gaber", "Ahmed") ;
var filteredNames = names.filter(name => name.size > 4);
val str = filteredNames.reduce((cum, name) => cum + " " + name)
print(str)// Sayed Gaber Ahmed
```
```scala
var nums = List (1,2,3) ;
val ans = nums.reduce((cum, num) => cum + num) ;
print(ans) ; // 6
```
### `Fold Left`
`Like as reduce but we can set initial value for accumulator.`
```scala
var nums = List (1,2,3) ;
val ans = nums.foldLeft(1.0F)((cum, num) => cum + num) ;
print(ans) ; // 7
```
## Hands On 
- create a Scala program that multiplies the factorial value and the cumulative summation value of each number in the given list.
- factFun function that takes the current number in the list as a parameter and returns the factorial value.
- sumFun function that takes the current number in the list as a parameter and returns the cumulative summation value.
- calcFun function which is a higher order function. It takes the current number and the previously mentioned functions as parameters and return the output
```scala
import scala.io.StdIn;
object Main{
  def factFun(n:Int): Int = {
    var ans = 1;
    for (i <-1 to n){ans = ans * i;}
    ans;
  }
  def sumFun(n:Int):Int= {
    var sum:Int = 0;
    for (i<-1 to n) {sum = sum + i;}
    return sum;
  }
  def calcFun(n:Int, fact:(Int)=>Int, sum:(Int)=>Int):Int={
     fact(n)*sum(n);
  }
  def main(args: Array[String]): Unit = {
    var lst = List(2,4,7,5);
    for (num <- lst) {
       println(calcFun(num, factFun,sumFun));
    }
  }
}
```
