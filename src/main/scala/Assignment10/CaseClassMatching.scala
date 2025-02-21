package Assignment10

object CaseClassMatching extends App {
  case class Person(name: String, age: Int)
  case class Student(name: String, group: String)

  def describe(x: Any): String = x match {
    case Person(name, age)  => s"Name: $name, Age: $age"
    case Student(name, group) => s"Name: $name, Group: $group"
    case _ => "Unknown type"
  }

  val p = Person("Manoj", 22)
  val s = Student("Hari", "CSE")

  println(describe(p))
  println(describe(s))
}
