package Assignment10

object PatternGuards extends App{
  def Find(num: Int): String=
    num match {
    case n if n % 2==0 && n < 50 =>"small even"
    case n if n % 2==0 && n >= 50 => "large even"
    case n if n% 2!=0 && n < 50 => "small odd"
    case n if n % 2!=0 && n >= 50 => "large odd"
    case _ =>"Not a valid number"
  }


  println(Find(20))
  println(Find(72))
  println(Find(33))
  println(Find(91))
}
