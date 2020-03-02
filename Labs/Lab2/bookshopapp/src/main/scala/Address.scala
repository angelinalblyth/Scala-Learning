class Address(number: Int, street: String, city: String, county: String, postcode: String) {
  override def toString: String = s"${number} ${street}, ${city}, ${county}, ${postcode}"
}
