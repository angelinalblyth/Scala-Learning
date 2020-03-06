//package cart
//
//import org.scalatest.funspec.AnyFunSpec
//import store.{Address, Author, Book, Price, Publisher, Technical}
//
//
//
//class ShoppingCartTest extends AnyFunSpec {
//
//  val author = Author("Pete Smith")
//  val address = Address(10, "High Street", "Salisbury", "Wiltshire", "SL10 34D")
//  val publisher = Publisher("Tech Books Publishing Ltd.", address)
//  val book = new Book("Scala Unleashed", Price(15.95), author, publisher, Technical)
//
//
//  describe("Shopping cart") {
//    it("when empty should return zero items") {
//      val cart = new ShoppingCart()
//      assert(cart.isEmpty())
//    }
//
//    it("should be able to add a item to the cart"){
//      val cart = new ShoppingCart()
//      cart.add(book)
//      assert(cart.size() == 1)
//    }
//  }
//}