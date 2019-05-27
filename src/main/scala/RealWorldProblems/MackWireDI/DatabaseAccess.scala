package RealWorldProblems.MackWireDI

case class DatabaseAccess()

case class SecurityFilter()

case class UserFinder(databaseAccess: DatabaseAccess, securityFilter: SecurityFilter)

case class UserStatusReader(id: String, userFinder: UserFinder)
