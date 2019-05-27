package RealWorldProblems.PureDI

import scala.concurrent.Future

trait Config {
  def className(name: String): String = name
}

trait IOConfigs extends Config {
  def connect: Future[Boolean]
  def close: Future[Boolean]
}

trait DependencyConfigs extends Config {
  def env: String
}