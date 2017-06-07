package controllers

import models.Sandwich

/**
  * Created by digital127522 on 07/06/17.
  */
class RealSandwichService extends SandwichService {
  //just an empty list
  override def sandwiches(): List[Sandwich] = List()
}
