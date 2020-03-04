package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER can infer types

  //val aSTring: String = "Hello"; val anotherString: String = "Good Bye"
  // You do not need the semi colon unless you are putting two statements on the same line
  // You should put them on separate lines

  val aSTring: String = "Hello"
  val anotherString: String = "Good Bye"

  // More Types

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
}
