package Assignment10

import org.scalatest.funsuite.AnyFunSuite

class PatternMatchingTest extends AnyFunSuite {

  test("describe int") {
    assert(Assignment10.PatternMatching.describe(12) == "12 is an integer")
  }

  test("describe double") {
    assert(Assignment10.PatternMatching.describe(10.2) == "10.2 is a double")
  }

  test("describe string") {
    assert(Assignment10.PatternMatching.describe("Manoj") == "Manoj is a string")
  }

  test("describe boolean") {
    assert(Assignment10.PatternMatching.describe(true) == "true is a boolean")
  }

  test("describe float") {
    assert(Assignment10.PatternMatching.describe(2.12f) == "2.12 is a float")
  }

  test("describe character") {
    assert(Assignment10.PatternMatching.describe('c') == "c is a character")
  }

  test("describe array") {
    assert(Assignment10.PatternMatching.describe(Array(1, 5, 2)) == "It is an array")
  }

  test("describe should return 'unknown type' ") {
    assert(Assignment10.PatternMatching.describe((1, 2)) == "(1,2) is an unknown type")
  }
}

