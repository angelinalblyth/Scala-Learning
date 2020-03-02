class Publisher(val name: String,val address: Address) {
  override def toString: String = s"${name}, ${address}"
}
