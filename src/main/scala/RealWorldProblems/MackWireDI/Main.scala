package RealWorldProblems.MackWireDI
import com.softwaremill.macwire._


// ****************** NUM 4 ***********************
object Main extends App {
  println("start test with mackWire DI lib !!!")
  lazy val theDatabaseAccess   = wire[DatabaseAccess]
  lazy val theSecurityFilter   = wire[SecurityFilter]
  lazy val theUserFinder       = wire[UserFinder]
  def theUserStatusReader(id: String): UserStatusReader = wire[UserStatusReader]

  println(theUserStatusReader("ID"))

  println("end")
}
