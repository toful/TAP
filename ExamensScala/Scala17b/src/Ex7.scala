




import scala.collection.mutable.ListBuffer



trait XComponent{
  def size:Int
}

trait XVisitor{
  def visit(f:XFile):Unit
  def visit(d:XDirectory):Unit
}


class XSizeVisitor(maxsize:Int) extends XVisitor {
  var files:ListBuffer[XFile] = new ListBuffer[XFile]()

  override def visit(f: XFile): Unit = if (f.size<maxsize) files.+=(f)

  override def visit(d: XDirectory): Unit = {}
}

case class XFile(val name:String,val amount:Int) extends XComponent {
  override def size = amount

  override def toString = s"File($name)"
}


case class XDirectory(val name:String) extends XComponent {
  var children: ListBuffer[XComponent] = new ListBuffer[XComponent]()

  def addChild(child: XComponent): Unit = {
    children += child
  }

  def removeChild(child: XComponent): Unit = {
    children -= child
  }

  override def size = {
    children.map(_.size).sum
  }


}

object Ex7 extends scala.App {

  def accept(z:XComponent,v:XVisitor):Unit= {
    z match {
      case d:XDirectory =>
        v.visit(d)
        d.children.foreach(accept(_, v))
      case f:XFile =>
        v.visit(f)
    }
  }



  val root: XDirectory = new XDirectory("root")
  val home: XDirectory = new XDirectory("home")
  val tap: XDirectory = new XDirectory("tap")
  val f1: XFile = new XFile("f1", 1234)
  val f2: XFile = new XFile("f2", 3445)
  val f3: XFile = new XFile("f3", 6688)
  val f4: XFile = new XFile("lp", 99999)

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

  val v = new XSizeVisitor(5000)
  accept(root,v)
  println(v.files)


}



