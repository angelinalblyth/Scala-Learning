package com.bbc

import akka.actor.Actor

class RepeatMessageActor extends Actor {
    def receive: Receive = {
      case s: String =>
        for (_ <- 1 to 20) print(s)
    }
  }

