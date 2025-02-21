package Assignment10

object PatternMatching extends App {
  def describe(x: Any): String = {
    x match {
      case int: Int => s"$int is an integer"
      case dou: Double=> s"$dou is a double"
      case str: String=> s"$str is a string"
      case bool: Boolean => s"$bool is a boolean"
      case char: Char=> s"$char is a character"
      case flo: Float => s"$flo is a float"
      case arr: Array[Int] => "It is an array"
      case _ => s"$x is an unknown type"
    }
  }

  println(describe(12))
  println(describe(10.2))
  println(describe("Manoj"))
  println(describe(true))
  println(describe(2.12f))
  println(describe(Array(1, 5, 2)))
  println(describe('c'))
  println(describe(10))
  println(describe(1, 2))
}
