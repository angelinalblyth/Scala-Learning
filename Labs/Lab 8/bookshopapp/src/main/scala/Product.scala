abstract class Product (val name: String, val price: Price) extends Sales {

  override def toString: String = s"$name, $price"

}
