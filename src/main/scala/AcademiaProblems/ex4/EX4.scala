package AcademiaProblems.ex4

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

case class Person(name: String, var isRiding: Boolean)(implicit val car: Car){
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

object EX4 extends App {
  implicit val samand = Car("samand", false)
  new PersonActions().act()
}
