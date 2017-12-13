package Exam1

trait FileSystem{
  val name:String
  def filter(f:FileSystem=>Boolean):List[FileSystem]
}
