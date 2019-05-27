package RealWorldProblems.CackPatternDI

import scala.concurrent.Future

trait Config {
  def className(name: String): String = name
}

trait IOConfig extends Config {
  def connect: Future[Boolean]
  def close: Future[Boolean]
}

trait DependencyConfigs extends Config {
  val env: String
}
