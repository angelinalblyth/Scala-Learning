class Book(val title: String, val price: Price, val author: Author, val publisher: Publisher, val genre: AnyRef) {

  private var salesPercentage = 0.0

  def setSaleDiscount(salesPercentage: Double) {
  this.salesPercentage = salesPercentage / 100
  }

  def calculateSalePrice(): Price ={
    price - (price * salesPercentage)
  }

  override def toString: String = s"Book($title, $price, $author, $publisher, Genre: $genre)"
}
