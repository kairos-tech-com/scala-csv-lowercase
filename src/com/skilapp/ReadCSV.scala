
//import scala._
import scala.io.Source

object ReadCSV {
  def main(args: Array[String]) {
  val filename = "E:JobDes.CSV"
  for(line <- Source.fromFile(filename).getLines()){
    println(line.toLowerCase())
      }
  
}
}