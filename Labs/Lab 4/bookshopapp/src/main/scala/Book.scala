
class Book(val title: String, val price: Double, val author: Author, val publisher: Publisher) {

  private var salesPercentage = 0.0

  def setSaleDiscount(salesPercentage: Double) {
  this.salesPercentage = salesPercentage / 100
  }

  def calculateSalePrice(): Double ={
    price - (price * salesPercentage)
  }

  override def toString: String = s"Book($title, $price, $author, $publisher)"
}
