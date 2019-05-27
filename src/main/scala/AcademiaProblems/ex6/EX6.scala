package AcademiaProblems.ex6

trait Car {
  var carName: String
  var isMoved: Boolean

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

  override def toString: String = s"Car('$carName','$isMoved')"
}

trait Person { this: Car =>
  var name: String
  var isRiding: Boolean

  def getInTheCar(): Unit = {
    openTheDoor()
    println("getting into the car!")
    closeTheDoor()
  }

  def getOutTheCar(): Unit = {
    openTheDoor()
    println("getting out of the car!")
    closeTheDoor()
  }

  def rideTheCar(): Unit = {
    turnOnTheCar()
    ridingMod()
    isRiding = true
    println(s"$name is riding $carName")
  }

  override def toString: String = s"Person('$name', '$isRiding', ${super.toString})"
}

trait PersonActions { this: Person =>
  def act(): Unit = {
    println(this)
    println()
    println()
    getInTheCar()
    println()
    println()
    rideTheCar()
    println()
    println()
    getOutTheCar()
  }
  override def toString: String = s"PersonActions(${super.toString})"
}

object EX6 extends App {

  val personAction = new Car with Person with PersonActions   {
    override var name: String = "Ali"
    override var isRiding: Boolean = false
    override var carName: String = "Samand"
    override var isMoved: Boolean = false
  }

  personAction.act()

}
