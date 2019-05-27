package RealWorldProblems.CackPatternDI

import scala.concurrent.Future

trait UserRepo { this: PostgreSQLBasic =>
  def conn = connect

  class UserDao extends CRUDDao[User] {
    override def insert(entity: User): Future[Long] = {
      println(s"inserting user $entity ... ")
      // postgresql.connection.insert(entity)
      // "insert into Public.USER_TBL name value (entity.name)"
      Future.successful(1)
    }

    override def select(id: Long): Future[Option[User]] = {
      println(s"select user with id: $id")
      //"select * from Public.USER_TBL where id=$id"
      //did not find user in this case ...
      Future.successful(None)
    }
  }

  def userDao = new UserDao()


  def disconn = close
}
