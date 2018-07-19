import java.io._

class Ton(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
   }

object Demo {
   def main(args: Array[String]) {
      val point = new Ton(10, 20)
      //point.move(10, 20);
      printPoint

      def printPoint{   //Defining printPoint method
         println ("Point x location : " + point.x);
         println ("Point y location : " + point.y);
      }
   }
}