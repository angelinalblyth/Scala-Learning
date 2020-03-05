package store

trait Printable extends Any {
  def print(): Unit = println(this)
}

case class Price(value: Double) extends AnyVal with Printable {
  def +(p: Price): Price = Price(value + p.value)

  def -(p: Price): Price = Price(value - p.value)

  def *(d: Double): Price = Price(value * d)

  def /(d: Double): Price = Price(value / d)
}