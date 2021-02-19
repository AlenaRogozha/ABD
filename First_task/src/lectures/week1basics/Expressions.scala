package lectures.week1basics

object Expressions extends App{
  val aVal = 1 + 2 * 3
  println(1 + 2 * 3)
  val aCondition = true
  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue) // выведет True Condition
  println(if(aCondition) "True Condition" else "False Condition") //выведет True Condition
  val someVal: Unit = println("I just want to print")

  val aCodeBlock = {
    val someVal = 1
    val y = 2
    if (someVal + y > 1) true else false
  }
  println(aCodeBlock) // выводит true

  val aCodeBlock2 = {
    val someVal1 = 1
    val y1 = 2
    if (someVal1 + y1 > 1) true else false
    "String to return"
  }
  println(aCodeBlock2) // выводит "String to return"

  val someValue = {
    1 < 0
    2 == 5
    4 < 9
  }
  val someCodeBlock = {
    if (someValue) 1 else 0
  }
  println(someCodeBlock)



}
