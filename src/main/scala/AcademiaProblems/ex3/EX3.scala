package AcademiaProblems.ex3

import com.softwaremill.macwire._

case class Car(name: String, var isMoved: Boolean) {
  def openTheDoor(): Unit = {
    println("the door is opened!")
  }

  def closeTheDoor(): Unit = {
    println("the door is closed!")
  }

  def turnOnTheCar(): Unit = {
    println("turned on. Wvvv Wvvv. ready to move")
  }

  def ridingMod(): Unit = {
    println("riding the car.")
    isMoved = true
  }
}

case class Person(name: String, var isRiding: Boolean, car: Car) {
  def getInTheCar(): Unit = {
    car.openTheDoor()
    println("getting into the car!")
    car.closeTheDoor()
  }

  def getOutTheCar(): Unit = {
    car.openTheDoor()
    println("getting out of the car!")
    car.closeTheDoor()
  }

  def rideTheCar(): Unit = {
    car.turnOnTheCar()
    car.ridingMod()
    isRiding = true
    println(s"$name is riding ${car.name}")
  }

}

object EX3 extends App {
  def car(name: String, isMoved: Boolean): Car = wire[Car]

  new PersonActions().act()
}
