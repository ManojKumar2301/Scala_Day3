package Assignment8

import org.scalatest.funsuite.AnyFunSuite

class MethodConflictTest extends AnyFunSuite {
  test("Method resolution in class D should call C's display method first") {
    val d = new D()
    assert(d.display() == println("C\nD"))  // Expected Output
  }
}

