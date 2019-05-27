package AcademiaProblems.ex5

import com.google.inject._

case class Car()

case class Person @Inject()(car: Car)

class DependencyModule extends Module {
  def configure(binder: Binder): Unit = {
    binder.bind(classOf[Car])
  }
}

object EX5 extends App {
  val injector = Guice.createInjector(new DependencyModule())
  val person = injector.getInstance(classOf[Person])
  println(person)
}
