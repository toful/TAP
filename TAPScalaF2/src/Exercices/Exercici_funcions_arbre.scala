
/*class ITree
case class Tree(left:ITree,value:Int,right:ITree) extends ITree
case class TNil() extends ITree
*/

object Exercici_funcions_arbre {

  def member(value:Int, tree:ITree):Boolean = tree match {
    case TNil() => false
    case Tree(left,item,right) => (item==value) || (member(value,left) || member(value,right))
  }


  def tree2List(x:ITree):List[Int] = x match {
    case TNil() => List()
    case Tree(a, b, c) => tree2List(a) ++ List(b) ++ tree2List(c)
  }

  def sumtree(tree:ITree):Int = tree match {
      case TNil() => 0
      case Tree(a,b,c) => sumtree(a) + b + sumtree(c)
  }

  def max(x:Int, y: Int): Int={
    if(x>y) x;
    else y;
  }

  def ex5(tree:ITree):Boolean = {
    def allSonsLittle(tree: ITree, elem: Int): Boolean = tree match {
      case TNil() => true
      case Tree(a, b, c) => b < elem && allSonsLittle(a, b) && allSonsLittle(c, b)
    }
    allSonsLittle(tree, Int.MaxValue)
  }

  def maxtree(tree:ITree):Int = tree match {
      case TNil() => 0
      case Tree(a,b,c) => max(b, max(maxtree(a), maxtree(c)))
  }

  def altura(tree:ITree): Int = tree match {
      case TNil() => 0
      case Tree(a,b,c) => max(1+altura(a), 1+altura(c))
  }

  def main(args: Array[String]) {

    val a1 = Tree(TNil(),3,Tree(TNil(),5,TNil()))

    val a2 = Tree(Tree(Tree(TNil(),2,TNil()),5,TNil()),13,Tree(TNil(),7,TNil()))

    println(tree2List(a1))

    println(tree2List(a2))

    println(member(9,a2))

    println(member(7,a2))

    println(sumtree(a2))

    println(sumtree(a1))

    println(maxtree(a2))

    println(altura(a2))

    println(altura(a1))



  }
}
