package store

import scala.util.{Failure, Success, Try}

object Bookshop {

  private val shopName = "My store.Book Store"
  private val address = new Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
  val books = getBooks()

  def printDetails(): Unit ={
    println(s"Notes: ${shopName}, address: ${address}, Books: ${books}")
  }

  private def getBooks():  Map[Genre, List[Book]]  = {

    val author1 = Author("Pete Smith")
    val author2 = Author("Joe Jones")
    val author3 = Author("Pete Andrews")
    val author4 = Author("Gryff Cooke")


    val address1 = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
    val address2 = Address(5, "The Estate", "Market Town", "Hampshire", "SL10 34D")
    val address3 = Address(340, "Long Mile", "Swindon", "Hampshire", "SL10 34D")

    val publisher1 = Publisher("Tech Books Publishing Ltd.", address1)
    val publisher2 = Publisher("Historical Books Are Us.", address2)
    val publisher3 = Publisher("Adriana Books", address3)


    val book1 = new Book("Scala Unleashed", Price(15.95), author1, publisher1, Technical)
    val book2 = new Book("Python in the Wild", Price(12.55), author2, publisher1, Technical)
    val book3 = new Book("The Wars of the Roses Retold", Price(12.34), author3, publisher2, History)
    val book4 = new Book("It was a Dark Night", Price(23.55), author4, publisher3, Fiction)

    val books: Map[Genre, List[Book]] = Map(
      Technical -> List(book1, book2),
      History -> List(book3),
      Fiction -> List(book4))
    books
  }
}