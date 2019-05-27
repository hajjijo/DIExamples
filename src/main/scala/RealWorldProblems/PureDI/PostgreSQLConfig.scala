package RealWorldProblems.PureDI

import scala.concurrent.Future

case class PostgreSQLConfig(host: String, port: String) extends IOConfigs {
  val cn: String = className("[PostgreSQL] -- ")

  override def connect: Future[Boolean] = {
    println(s"$cn connect to postgre on port http://$host:$port !!")
    Future.successful(true)
  }

  override def close: Future[Boolean] = {
    println(s"$cn connection closed!")
    Future.successful(true)
  }
}
