package Exam1

class File(val name:String,val size:Int) extends FileSystem{
  override def filter(f: FileSystem => Boolean): List[FileSystem] ={
    if(f(this)) List(this) else Nil
  }
}
