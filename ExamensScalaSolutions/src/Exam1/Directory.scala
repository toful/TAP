package Exam1

class Directory(val name:String,var childs:List[FileSystem]) extends FileSystem{
  def addChild(c:FileSystem)= childs=c::childs;

  override def filter(f: FileSystem => Boolean): List[FileSystem] ={
    if(f(this)) this::childs.flatMap(_.filter(f)) else childs.flatMap(_.filter(f))
  }

}
