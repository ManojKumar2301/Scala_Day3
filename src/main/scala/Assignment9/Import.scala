package Assignment9

import Assignment9.Animal.{Dog, Cat}
import Assignment9.Traits.{Duck, Penguin}
import Assignment9.Utils._

object Import extends App{
  val d=new Duck()
  val p=new Penguin()
  d.fly()
  d.swim()
  p.fly()
  p.swim()

  val dog = new Dog
  val cat = new Cat

  println(dog.speak())
  println(cat.speak())

  display()//export
}
