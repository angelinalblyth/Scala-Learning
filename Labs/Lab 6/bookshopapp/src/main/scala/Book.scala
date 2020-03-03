class Book(val _name: String, val _price: Price, val author: Author, val publisher: Publisher, val genre: AnyRef) extends Product(_name, _price) {

  override def toString: String = s"Book($name, $price, $author, $publisher, Genre: $genre)"
}
