package application

import store._

object BookshopApp extends App {
  println("Welcome to the Bookshop\n")

  val prettyBook = (b: Book) => println(s"Book ${b.name} \n\t${b.price}")

//  Bookshop.printDetails()

//  println(s"store.Book: ${Bookshop.books}")
//  println("\nCalculating the store.Sales Discount price")
//  Bookshop.book.setSaleDiscount(10.0)
//  println(s"Sale price of book: ${Bookshop.book.calculateSalePrice()}")

  val books = Bookshop.books.get(Technical).get

  val prettyPrint = books.map(prettyBook)

  val bookFilter = books.filter(book => book.price.value < 15.00)
  
  println(bookFilter)

}
