/**
 * Created by pedro on 13/01/16.
 */


object Ex2 extends scala.App{

  def findAs(list:List[String]):List[String] = {
    list.filter(_.startsWith("a")).map(_.toUpperCase())
  }

  println(findAs(List("pedro","ana","paco","amigo")))


}
