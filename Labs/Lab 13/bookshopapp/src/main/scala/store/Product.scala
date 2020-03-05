package store

abstract class Product (val name: String, val price: Price) extends Sales {

  if(price.value <= 0.01){
    throw new BookshopException("Invalid Price")
  }

  override def toString: String = s"$name, $price"

}
