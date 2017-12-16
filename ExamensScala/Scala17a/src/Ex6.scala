

import scala.collection.mutable.ListBuffer


trait Visitor{
  def visit(f:File):Unit
  def visit(d:Directory):Unit
}

trait AComponent{
  def size:Int
  def accept(v:Visitor)
}

class SizeVisitor(maxsize:Int) extends Visitor {
  var files:ListBuffer[File] = new ListBuffer[File]()

  override def visit(f: File): Unit = if (f.size<maxsize) files.+=(f)

  override def visit(d: Directory): Unit = {}
}

class File(val name:String,val amount:Int) extends AComponent {
  override def size = amount

  override def accept(v: Visitor): Unit = v.visit(this)

  override def toString = s"File($name)"
}


class Directory(val name:String) extends AComponent {
  private var children: ListBuffer[AComponent] = new ListBuffer[AComponent]()

  def addChild(child: AComponent): Unit = {
    children += child
  }

  def removeChild(child: AComponent): Unit = {
    children -= child
  }

  def getChildren = children

  override def size = {
    children.map(_.size).sum
  }

  override def accept(v: Visitor): Unit = {
    v.visit(this)
    children.foreach(_.accept(v))

  }
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

  val v = new SizeVisitor(5000)
  root.accept(v)
  println(v.files)

}