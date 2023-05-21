# `Scala | Exam A`
- Create a Scala Course class.
  - Create constructor in the header initializing name as private and grade as private.
  - Define a parameterized constructor with name as a parameter and set grade with 0.
  - Define the getter for grade feature.
  - Has a display Info function to display the Course name and grade.

- Main
  - Create 3 instances of Course: 2 instances with name and grade and 1 instance with name only.
  - Create a list of 3 Course instances.
  - Use a higher order function to invoke the display Info function for every instance.
  - Use a popular higher order function to get the max grade form course list.

- Example
  - Course name is Concepts, and course grade is 80 
  - Course name is 00P, and course grade is 0
  - Course name is SP, and course grade is 90
  - The max grade is 90 

# `Scala | Exam A - Solution`
```scala
package ExamA

class Course (private var name:String, private var grade:Int){
  def this(name:String) = {
    this(name,0);
  }
  def getGrade():Int = {
    return grade;
  }
  def displayInfo():Unit = {
    println("Course name: " + name + ", and Course grade: " + grade);
  }
}
```
```scala
package ExamA

object Main {
  def main(args: Array[String]): Unit = {
    var course1 = new Course("Concept", 80);
    var course2 = new Course("OOP");
    var course3 = new Course("SP", 90);

    var courses = List(course1, course2, course3);
    courses.foreach(course => course.displayInfo());

    var mx = courses.foldLeft(-1)((mx, cur) => if (cur.getGrade() > mx) cur.getGrade() else mx);
    println("Max Grade: " + mx);
  }
}
```
