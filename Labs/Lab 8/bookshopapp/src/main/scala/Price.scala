case class Price (value: Double) extends  AnyVal  {

  def -(p: Price) : Price = Price(value - p.value)
  def +(p: Price) : Price = Price(value + p.value)
  def *(d :Double) : Price = Price(value * d)
  def /(d :Double) : Price = Price(value / d)
}

