
//Option seria una caixa
Option(2).map(_ * 2)

List(1,2,2,3).map(_ * 2)

trait Monad[F[_]]{
  def pure
}

//exmple d'ús de monad
def sum[F[_]: Monad](x: F[Int], y:F[Int]): F[Int] ={
  for{
    a <- x
    b <- y
  }yield a + b
}

