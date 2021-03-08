package karazin.scala.users.group.week1.homework

import java.util.UUID

// Do not forget to import custom implementation
import adt._
import model._

/*
  Dummy services
  
  The services need to be implemented in case of running the code
 */
object services:
  
  def getUserProfile(): ErrorOf[UserProfile] = ???
  
  
  def getPosts(userId: UUID): ErrorOf[List[Post]] =
    for
    profile ← getUserProfile()
    posts   ← getPosts(profile.userId)
      yield posts



 
      
  
  
  def getComments(postId: UUID): ErrorOf[List[Comment]] = ??? 
  def getLikes(postId: UUID): ErrorOf[List[Like]] = ???
  def getShares(postId: UUID): ErrorOf[List[Share]] = ???
