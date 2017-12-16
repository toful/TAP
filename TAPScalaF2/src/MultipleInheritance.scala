
trait Talkable {
  def talk():String {}  //el mètode no fa falta qu estigui implementat, podem borrar els corxetes
}

trait XAnimal extends Talkable {
  override def talk():String = "I am an Animal"
}

trait XPerson {
   def say():String = "I am a person"
}

class Mutant extends XAnimal with XPerson

class Alien (name:String)

object MultipleInheritance {
  def main(args: Array[String]) {
    val m = new Mutant()
    println (m.talk())
    println (m.say())

    val x:XAnimal = m
    val y:XPerson = m


    val et = new Alien("ET") with XAnimal with XPerson
    println(et.say())
    println(et.talk())

    val x1:XAnimal = et
  }

}




