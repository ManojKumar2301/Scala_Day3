package Assignment9.Traits

class Duck extends Flying with Swimming{
  def fly(): Unit = {
    println("Duck can fly")
  }
  def swim(): Unit = {
    println("Duck can swim")
  }
}

class Penguin extends Flying with Swimming {
  def fly(): Unit = {
    println("Penguin cannot fly")
  }

  def swim(): Unit = {
    println("Penguin can swim")
  }
}

