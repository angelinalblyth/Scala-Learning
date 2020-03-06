package com.bbc
import akka.actor._

class ActorClass extends Actor{
  override def receive: Receive = {
    case "Hello" => println("Hello World")
    case "Goodbye" => println("Goodby World")
    case _ => println ("another Message")
  }
}
