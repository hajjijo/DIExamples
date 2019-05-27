package RealWorldProblems.PureDI

import scala.concurrent.Future

trait DAO {
  def insert(entity: Entity): Boolean
//  def select(id: Long): Option[Entity]
//  def selectAll: List[Entity]
//  def delete(id: Long): Boolean
//  def update(entity: Entity)
  def closeConnection: Future[Boolean]
}
