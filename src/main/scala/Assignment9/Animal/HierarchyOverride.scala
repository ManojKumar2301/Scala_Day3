package Assignment9.Animal

abstract class Animal {
  def speak(): String
  def sound(): String = "This animal says: "
}

class Dog extends Animal {
  override def speak(): String = {
    super.sound() + "Bow Bow"
  }
}

class Cat extends Animal {
  override def speak(): String = {
    super.sound() + "Meow Meow"
  }
}
