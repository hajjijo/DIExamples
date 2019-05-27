package RealWorldProblems.CackPatternDI

import scala.concurrent.Future

trait PostgreSQLBasic { this: IOConfig =>
  val host: String = "localhost"
  val port: Int = 5473

  override def connect: Future[Boolean] = {
    println(s"connect to postgresql $host:$port")
    Future.successful(true)
  }

  override def close: Future[Boolean] = {
    println(s"connection closed")
    Future.successful(true)
  }

  trait CRUDDao[E <: Entity] {
    def insert(entity: E): Future[Long]
    def select(id: Long): Future[Option[E]]
  }

}
