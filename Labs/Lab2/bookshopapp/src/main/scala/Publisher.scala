class Publisher(name: String, address: Address) {
  override def toString: String = s"${name}, ${address}"
}
