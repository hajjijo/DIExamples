package AcademiaProblems.ex4

class PersonActions()(implicit val car: Car) {
  val ali = Person("ali", false)
  def act(): Unit = {
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
