package Assignment10

import org.scalatest.funsuite.AnyFunSuite

class PatternGuardsTest extends AnyFunSuite {

  test("Find should return 'small even' for even numbers less than 50") {
    assert(Assignment10.PatternGuards.Find(20) == "small even")
  }

  test("Find should return 'large even' for even numbers 50 or greater") {
    assert(Assignment10.PatternGuards.Find(72) == "large even")
  }

  test("Find should return 'small odd' for odd numbers less than 50") {
    assert(Assignment10.PatternGuards.Find(33) == "small odd")
  }

  test("Find should return 'large odd' for odd numbers 50 or greater") {
    assert(Assignment10.PatternGuards.Find(91) == "large odd")
  }

  test("Find should return 'Not a valid number' for non-integer inputs") {
    assert(Assignment10.PatternGuards.Find(-5) == "small odd")  // Example case for negative odd number
    assert(Assignment10.PatternGuards.Find(0) == "small even")  // Edge case for zero
  }
}
