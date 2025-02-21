package Assignment8

import org.scalatest.funsuite.AnyFunSuite

class TraitsTest extends AnyFunSuite {
  test("Duck should be able to fly and swim") {
    val duck = new Duck()
    assert(duck.fly() == println("Duck can fly"))
    assert(duck.swim() == println("Duck can swim"))
  }

  test("Penguin should not be able to fly but should swim") {
    val penguin = new Penguin()
    assert(penguin.fly() == println("Penguin cannot fly"))
    assert(penguin.swim() == println("Penguin can swim"))
  }
}

