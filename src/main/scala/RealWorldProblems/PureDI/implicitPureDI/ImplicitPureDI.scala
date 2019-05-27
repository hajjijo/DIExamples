package RealWorldProblems.PureDI.implicitPureDI

import RealWorldProblems.PureDI.{IOConfigs, PostgreSQLConfig, User}

object ImplicitPureDI extends App {
  implicit val postgreSQLConfig: IOConfigs = PostgreSQLConfig("196.168.10.1", "3000")

  // ****************** NUM 3 ***********************
  val dao = UserDAOImplicitly()
  val insertResult = dao.insert(User("Ali"))
  println("result is: " + insertResult)
  dao.closeConnection
}
