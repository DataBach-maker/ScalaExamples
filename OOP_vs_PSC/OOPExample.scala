// Data Object Asymetry
// Object Oriented example

case class Square(var side: Double = 0) {

  println(side * side)

}

case class Rectangle(var height: Double = 0, var width: Double = 0) {

  println(height * width)

}

case class Circle(
    var pi: Double,
    var center: Double = 0,
    var radius: Double = 0
) {

  println(pi * radius * radius)

}

object Geometry extends App {

  val pi = 3.141
  val side = 2.0
  val height = 1.0
  val width = 2.0
  val center = 2.0
  val radius = 0.5

  Square(side)
  Rectangle(height, width)
  Circle(pi, center, radius)

}