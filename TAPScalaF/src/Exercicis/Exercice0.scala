/**
  * Created by Tòful.
  */

object Exercice0 extends scala.App{

  /*Given the list if Integers from 1..100, return the list of odd numbers from this list, and then obtain the power of each element of the list
     ex1 [1,2,3,4,5,6,7,8] -> [1,9,25,49]*/

  val  list1 = List.range(1,100)

  println(list1)

  def odd(l:List[Int]): List[Int] ={
    l.filter((elem)=>elem%2!=0)
  }

  def oddPower(l:List[Int]): List[Int] ={
    odd(l).map(elem => elem*elem)
  }

  println(odd(list1))
  println(oddPower(list1))

  /*Create a function ex2 that accepts a list of Ints,  one function that filter the list and one function that modifies the list (map)*/
  def ex2(l:List[Int],f:(Int=>Boolean), f2:(Int=>Int)): List[Int] ={
    l.filter(f).map(f2)
  }

  val  list2 = List.range(1,11)
  println("\nApartat b:\n"+list2)
  println(ex2(list2,x=>x%2==0,x=>x*x*x))

  /*Use currying and partial parametrization to create a new function evenapply that reuses ex2 for even numbers (filter function)*/
  val evenapply = ex2(_:List[Int],x=>x%2==0,_:(Int=>Int))
  println("\nApartat c:\n"+evenapply(list2,x=>x*x*x))

  /*Create a function ex3 like ex2 but for any type in the list. Show examples with different types*/
  def ex3 [T] (l:List[T],f:(T=>Boolean), f2:(T=>T)): List[T] ={
    l.filter(f).map(f2)
  }

  val  list3 = List("a","b","c","d")
  println("\nApartat d:\n"+ex3(list3,(x:String)=>x.equals("b"),(x:String)=>x.toUpperCase))


}
