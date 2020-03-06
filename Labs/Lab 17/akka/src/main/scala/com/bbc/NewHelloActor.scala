package com.bbc

import akka.actor.{ActorSystem, Props}

object NewHelloActor {
  val actorSystem = ActorSystem("MyHWActorSystem")
  val actorProps = Props(new ActorClass())
  val actor = actorSystem.actorOf(actorProps)
  actor ! "Hello"
  actor ! "Goodbye"
  actor ! "John"
  actor ! 42
  actorSystem.terminate()
}
