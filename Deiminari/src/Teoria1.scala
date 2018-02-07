
object  Teoria1 extends scala.App{
  //Option seria una caixa
  println(Option(2).map(_ * 2))

  println(List(1,2,2,3).map(_ * 2))

  //def add1[A[_] :Functor](a: A)= a.map(_ + 1)
}


