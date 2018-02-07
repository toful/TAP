import scala.collection.mutable.ListBuffer

/*Exercise 1. Implement the composite pattern (FileSystem) in Scala*/

trait FileSystem {
  def size():Int
}

//Llista inmutable
class Directory(val name:String, var children:List[FileSystem])extends FileSystem {
  def addChild(f:FileSystem) = children = f::children
  override def size():Int = {children.map(_.size()).sum}
}

//Llista mutable
class Directory2(val name:String, var children:ListBuffer[FileSystem])extends FileSystem {
  def addChild(f:FileSystem) = children+=f
  override def size():Int = {children.map(_.size()).sum}
}

class File (val name:String, val s:Int) extends FileSystem{
  override def size():Int = s
}

object Exercice1_Composite extends scala.App {
  val l1 = List(new File("TAP",10), new File("ESO", 15), new File("IPO",0))
  val uni = new Directory("uni",l1)
  val l2 = List(uni, new File("CV", 5), new File("Foto",30))
  val home = new Directory("home",l2)
  val root = new Directory("root",List(home))

  println(uni.size())
  println(root.size())

}
