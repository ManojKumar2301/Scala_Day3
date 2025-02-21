package Assignment10

import org.scalatest.funsuite.AnyFunSuite

class CaseClassMatchingTest extends AnyFunSuite {

  test("describe should correctly match Person case class") {
    val person = Assignment10.CaseClassMatching.Person("Manoj", 22)
    assert(Assignment10.CaseClassMatching.describe(person) == "Name: Manoj, Age: 22")
  }

  test("describe should correctly match Student case class") {
    val student = Assignment10.CaseClassMatching.Student("Hari", "CSE")
    assert(Assignment10.CaseClassMatching.describe(student) == "Name: Hari, Group: CSE")
  }

  test("describe should return 'Unknown type' for unrecognized input") {
    assert(Assignment10.CaseClassMatching.describe(42) == "Unknown type")
  }
}
