object Bookshop {

  private val shopName = "My Book Store"
  private val address = new Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
  val book = getBook()

  def printDetails(): Unit ={
    println(s"Notes: ${shopName}, address: ${address}, Books: ${book}")
  }

  private def getBook(): Book = {

    val author = new Author("Pete Smith")
    val address = new Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
    val publisher = new Publisher("Tech Books Publishing Ltd.", address)
    new Book("Scala Unleashed", 15.95, author, publisher)
  }
}
