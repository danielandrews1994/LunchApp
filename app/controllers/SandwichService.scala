package controllers

import com.google.inject.ImplementedBy
import models.Sandwich
import scala.concurrent.Future

/**
  * Created by digital127522 on 07/06/17.
  */
@ImplementedBy(classOf[RealSandwichService])
trait SandwichService {
  def sandwiches() : Future[List[Sandwich]]
}