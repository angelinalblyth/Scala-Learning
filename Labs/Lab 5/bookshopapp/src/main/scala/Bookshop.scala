import bookshop.Technical

object Bookshop {

  private val shopName = "My Book Store"
  private val address = new Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
  val book = getBook()

  def printDetails(): Unit ={
    println(s"Notes: ${shopName}, address: ${address}, Books: ${book}")
  }

  private def getBook(): Book = {

    val author = Author("Pete Smith")
    val address = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
    val publisher = Publisher("Tech Books Publishing Ltd.", address)
    val book = new Book("Scala Unleashed", Price(15.95), author, publisher, Technical)
    book
  }
}
