object SumFunction {
   def main(args: Array[String]) {
      println( "Returned Value for sum is: " + addInt(15,15) );
      println( "Returned Value for sub is: " + subInt(15,15) );
   }
   
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
   
   def subInt(a:Int, b:Int) : Int = {
     var sub:Int = 0
      sub = a - b
      //println(sub)
       return sub
   }
}