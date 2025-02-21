package Assignment8

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

object MixingTraits extends App{
  val d=new Duck()
  val p=new Penguin()
  d.fly()
  d.swim()
  p.fly()
  p.swim()
}
