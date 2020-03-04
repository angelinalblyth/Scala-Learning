package application

import store._

object BookshopApp extends App {
  println("Welcome to the Bookshop\n")

//  Bookshop.printDetails()

//  println(s"store.Book: ${Bookshop.books}")
//  println("\nCalculating the store.Sales Discount price")
//  Bookshop.book.setSaleDiscount(10.0)
//  println(s"Sale price of book: ${Bookshop.book.calculateSalePrice()}")

  val books = Bookshop.books.get(Technical).get

  val prettyBook = (b: Book) => println(s"Book ${b.name} \n\t${b.price}")

  prettyBook(books.head)
}
