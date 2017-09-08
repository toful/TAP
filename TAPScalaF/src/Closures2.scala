/**
 * Created by pedro on 17/09/15.
 */



object Closures2 extends scala.App{

  def convert(name:String,f:(String=>String)):String = {
      f(name)
  }


  def convert2 [T] (name:T,f:(T=>T)):T = {
    f(name)
  }



    println(convert("pedro",(elem)=>elem.toUpperCase))
    println(convert("pedro",_.toUpperCase))


    println(convert2("pedro",(elem:String)=>elem.toUpperCase))
    println(convert2(76868,(elem:Int)=>elem*elem))



}