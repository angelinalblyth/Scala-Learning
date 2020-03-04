package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  // VALS ARE IMMUTIBLE

  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val anotherString = "Bye"

  // You do not need ;
  // Only used for multiple strings

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 734944242232232342L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // Variables

  var aVariable: Int = 2
  aVariable = 7  //side effect
  // Can reassign VARS





}
