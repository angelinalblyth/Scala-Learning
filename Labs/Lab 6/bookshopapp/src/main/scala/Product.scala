class Product (val name: String, val price: Price) {

  private var salesPercentage = 0.0

  def setSaleDiscount(salesPercentage: Double) {
    this.salesPercentage = salesPercentage / 100
  }

  def calculateSalePrice(): Price ={
    price - (price * salesPercentage)
  }

  override def toString: String = s"Product($name, $price)"

}
