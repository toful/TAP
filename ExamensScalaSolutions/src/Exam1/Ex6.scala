package Exam1

object Ex6 extends scala.App{
  val root: Directory = new Directory("root",List())
  val home: Directory = new Directory("home",List())
  val tap: Directory = new Directory("ftap",List())
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

  println(root.filter(f=>f.name.startsWith("f")).map(_.name))
}
