// Data Object Asymetry
// Procedual example

case class Square(var side: Double = 0) {}

case class Rectangle(var height: Double = 0, var width: Double = 0) {}

case class Circle(var center: Double = 0, var radius: Double = 0) {}

object Geometry extends App {

  val pi = 3.141
  val square = Square(2.0)
  val rectangle = Rectangle(1.0, 2.0)
  val circle = Circle(1, 0.5)
  val shapes = List(square, rectangle, circle)

  def hasArea(shape: Any): Unit =
    shape match {

      case Square(side) => println(side * side)

      case Rectangle(height, width) => println(height * width)

      case Circle(center, radius) => println(pi * radius * radius)

      case _ => println("Not a Shape")

    }

  
  shapes.foreach(shape => hasArea(shape))

}