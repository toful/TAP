
/*5. Create a List of Persons (name,phone, age).
 a) Use the function reduce or fold to obtain the oldest person in the list
 b) Obtain the phones of the persons whose age is greater than 40*/

case class Person(name: String,phone: Int,age: Int)

object Exercice5 extends scala.App{

  val list = List(Person("Pepe",847384783,35),Person("Ramon",847384783,40),Person("Ermenegildo",847384783,89),Person("Eustaquio",847384783,99),Person("Segismundo",847384783,36))

  def maxAge(x:Person, y:Person): Person={
    if(x.age>y.age) x;
    else y;
  }

  println(list.foldLeft (Person("",0,0)) (maxAge))

  println(list.reduce(maxAge))

  println(list.filter(x=>x.age>40).map(x=>x.phone))

  println(list.filter(_.age>40).map(_.phone))

}
