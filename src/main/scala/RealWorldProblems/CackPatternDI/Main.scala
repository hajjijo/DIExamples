package RealWorldProblems.CackPatternDI

// ****************** NUM 5 ***********************
object Main extends App {

  val userRepo = new UserRepo with PostgreSQLBasic with IOConfig

  userRepo.conn
  val user = User("Akbar")
  userRepo.userDao.insert(user)
  userRepo.disconn
}
