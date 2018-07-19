import java.io._

class Pnt(val xc: Int, val yc: Int) {
  
    def move(dx: Int, dy: Int) {
    var x = xc + dx
    var y = yc + dy
    
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Pnt(xc, yc){
   
   def move(dx: Int, dy: Int, dz: Int) {
     var x = xc + dx
     var y = yc + dy
     var z = zc + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}

object DataInheritance {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);

      // Move to a new location
      loc.move(10, 10, 5);
   }
}
