package com.bbc

import akka.actor.{ActorSystem, Props}

object RepeatMessageActorApp  extends App {
    println("Set up configuration for Actor System")

    val props = Props[RepeatMessageActor].withDispatcher("akka.actor.my-pool-dispatcher")

      val system = ActorSystem("MyActorSystem")
      println("Creating Actors")
      val actor1 = system.actorOf(props, name="actor1")
      val actor2 = system.actorOf(props, name="actor2")
      val actor3 = system.actorOf(props, name="actor3")
      val actor4 = system.actorOf(props, name="actor4")
      val actor5 = system.actorOf(props, name="actor5")
      println("Sending messages")
      actor1 ! "A"
      actor2 ! "B"
      actor3 ! "C"
      actor4 ! "D"
      actor5 ! "E"
      println("Messages sent")
      println("Press Enter to terminate")
      scala.io.StdIn.readLine()
      //shutdown the actor system
      system.terminate()
      }


