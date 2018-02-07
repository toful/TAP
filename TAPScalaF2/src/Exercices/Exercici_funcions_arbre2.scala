class ITree
case class Tree(left:ITree,value:Int,right:ITree) extends ITree
case class TNil() extends ITree


object Exercici_funcions_arbre2 extends scala.App {

  /*-- a) Implement "oldest_child" function that return one boolean that indicate:
-- For all numerical tree, the child's value is higher that father's value.
-- b) Implement "make_greatest" function that receive one tree
-- It modify child's values that it was lower that its direct fathers.
-- This value is father's values +1


-- ex:     4                          4
--       /   \                      /   \
--      6     3     becomes:    6     5
--     / \   / \                  / \   / \
--    8   4 9   5                8   7 9   6

-- Use tree definition:

data Tree a = Plant ((Tree a),a, (Tree a)) | Anil deriving (Eq)
instance Show a => Show(Tree a) where
  show Anil = "o"
  show (Plant(a,b,c))= "<" ++ show a ++ "|" ++ show b ++ "|" ++ show c ++ ">"
*/

  val a2 = Tree(Tree(Tree(TNil(),8,TNil()),6,Tree(TNil(),4,TNil())),4,Tree(Tree(TNil(),9,TNil()),3,Tree(TNil(),5,TNil())))

  //def aux(a:Int, b:Int)= if(a>b) true else false

  def oldest_child(t:ITree, father:Int):Boolean=t match{
    case TNil() => true
    case Tree(a,b,c) => father>b && oldest_child(a,b) && oldest_child(c,b)
  }

  def print_tree(t:ITree):String = t match{
    case TNil() => ""
    case Tree(a,b,c) => b+"\n"+print_tree(a)+"\t"+print_tree(c)
  }

  def make_greatest(t:ITree, father:Int):ITree = t match {
    case TNil() => TNil()
    case Tree(a,b,c) => if(b>father) Tree(make_greatest(a,b), b, make_greatest(c,b)) else Tree(make_greatest(a,father+1), father+1, make_greatest(c,father+1))
  }

  println(print_tree(a2))
  println(oldest_child(a2,Int.MaxValue))
  println(print_tree(make_greatest(a2, Int.MinValue)))

}
