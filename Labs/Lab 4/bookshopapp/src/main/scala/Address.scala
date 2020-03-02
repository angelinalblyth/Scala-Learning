class Address(val number: Int, val street: String, val city: String, val county: String, val postcode: String) {
  override def toString: String = s"${number} ${street}, ${city}, ${county}, ${postcode}"
}
