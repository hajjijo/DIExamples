package AcademiaProblems.ex3

import AcademiaProblems.ex3.EX3.car
import com.softwaremill.macwire.wire

class PersonActions() {
  def person(name: String, isRiding: Boolean, car: Car): Person = wire[Person]
  val ali = person("ali", false, car("samand", false))

  def act() : Unit = {
    println(ali)
    println()
    println()
    ali.getInTheCar()
    println()
    println()
    ali.rideTheCar()
    println()
    println()
    ali.getOutTheCar()
  }
}
