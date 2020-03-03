object BookshopApp extends App {
  println("Welcome to the Bookshop\n")

  Bookshop.printDetails()

  println(s"Book: ${Bookshop.book}")
  println("\nCalculating the Sales Discount price")
  Bookshop.book.setSaleDiscount(10.0)
  println(s"Sale price of book: ${Bookshop.book.calculateSalePrice()}")
}