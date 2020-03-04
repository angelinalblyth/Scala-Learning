package store

trait Sales {

  val price: Price
  private var salesPercentage = 0.0

  def setSaleDiscount(salesPercentage: Double) {
    this.salesPercentage = salesPercentage / 100
  }

  def calculateSalePrice(): Price ={
    price - (price * salesPercentage)
  }

}
