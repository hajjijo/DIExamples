package RealWorldProblems.PureDI

object PureMain extends App {

  //Functional way ...
  // ****************** NUM 1 ***********************
  val makeUserDao: IOConfigs => DAO = { conf => UserDAO(conf) }
  val dao = makeUserDao(PostgreSQLConfig("196.115.30.25", "8080"))

  // ****************** NUM 2 ***********************
  //  //Object Oriented way ...
//      val dao = UserDAO(PostgreSQLConfig("localhost", "5432"))

  val insertResult = dao.insert(User("Mohammad"))
  println("result is: " + insertResult)
  dao.closeConnection
}
