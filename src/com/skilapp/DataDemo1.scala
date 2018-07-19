import java.io._   //importing a package

//here class also works as a constructor
class Point(val xc: Int, val yc: Int) {  //define a class with two variables xc and xy
   var x: Int = xc      // assigning a variables xc and yc to x and y
   var y: Int = yc
   
   var x1 = xc  //variable declaration without datatype
   var y1 = yc 
   
   def move(dx: Int, dy: Int) {   //define a method 
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

object DataDemo1 {    // main object
   def main(args: Array[String]) {
      val pt = new Point(1, 2);  // pt is object created for class "point" 

      // Move to a new location
      pt.move(10, 10);
   }
}