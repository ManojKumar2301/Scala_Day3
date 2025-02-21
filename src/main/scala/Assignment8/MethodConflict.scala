package Assignment8

trait A {
  def display():Unit = {
    println("A")
  }
}

trait B extends A{
  override def display():Unit = {
    println("B")
  }
}
trait C extends A{
  override def display():Unit ={
    println("C")
  }
}

class D extends B with C{
  override def display(): Unit = {
    super.display()
    //super[B].display()
    println("D")
  }
}

object Main extends App{
  val d=new D()
  d.display()
}
