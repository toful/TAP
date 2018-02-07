/*6. Usando la implementacion del patron composite, añade la funcion map al sistema de ficheros y directorios.
      Muestra un ejemplo en el que obtengamos con map una lista de Strings con todos los nombres de ficheros y directorios.*/

package Exam3

import scala.collection.mutable.ListBuffer

trait AComponent{
  def size:Int
  def name:String
  def map[T](f:AComponent=>T):List[T]
}

class File(val name:String,val amount:Int) extends AComponent {
  override def size = amount

  override def map[T](f: AComponent => T): List[T] = List(f(this))
}


class Directory(val name:String) extends AComponent {
  private var children: ListBuffer[AComponent] = new ListBuffer[AComponent]()

  def addChild(child: AComponent): Unit = {
    children += child
  }

  def removeChild(child: AComponent): Unit = {
    children -= child
  }

  override def size = {
    children.map(_.size).sum
  }

  override def map[T](f: AComponent => T): List[T] = f(this)::children.toList.map(f)
}


object Ex6 extends scala.App {
  val root: Directory = new Directory("root")
  val home: Directory = new Directory("home")
  val tap: Directory = new Directory("tap")
  val f1: File = new File("f1", 1234)
  val f2: File = new File("f2", 3445)
  val f3: File = new File("f3", 6688)
  val f4: File = new File("lp", 99999)

  root.addChild(home)
  root.addChild(f1)
  home.addChild(tap)
  home.addChild(f2)
  tap.addChild(f3)
  root.addChild(f4)

  println("-------------")

  println("Root SIZE:" + root.size)
  println("Home SIZE:" + home.size)
  println("TAP SIZE:" + tap.size)

  println("Names: "+ root.map(_.name))

}