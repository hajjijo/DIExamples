package AcademiaProblems.ex1

case class Car(name: String, isMove: Boolean)
case class Person(name: String, isRiding: Boolean, car: Car)

object EX1 extends App {
  val samand = new Car("samand", false)
  val ali = new Person("ali", false, samand)
  println("before ali get in the car!")
  println(ali)
  val aliIsRidingSamand = ali.copy(isRiding = true,car = samand.copy(isMove = true))
  println("after ali start riding the car!")
  println(aliIsRidingSamand)
}
