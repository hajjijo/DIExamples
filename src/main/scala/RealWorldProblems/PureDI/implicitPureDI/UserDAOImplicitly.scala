package RealWorldProblems.PureDI.implicitPureDI

import RealWorldProblems.PureDI.{DAO, Entity, IOConfigs, User}

import scala.concurrent.duration._
import scala.concurrent.{Await, Future, TimeoutException}

case class UserDAOImplicitly(implicit dbConfig: IOConfigs) extends DAO {

  try {
    Await.result(dbConfig.connect, 2.seconds)
  } catch {
    case _: TimeoutException => throw new Exception("cannot connect to db!" + dbConfig.className("[UserDAO]"))
    case e: Throwable => throw new Exception("something went wrong in " + dbConfig.className("[UserDAO]") + e.getMessage)
  }

  def insert(entity: Entity): Boolean = {
    //do some insert
    println(s"inserting $entity to db ...")
    true
  }

  def select(id: Long): Option[User] = {
    //do some select
    None
  }
  // other CRUD functions ...

  def closeConnection: Future[Boolean] = dbConfig.close
}
