
//Private modifier
class ScalaModifiers {
   class Inner {
      private def f() { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
  // (new Inner).f() // Error: f is not accessible
}

//Protected modifier
/*package p {
   class Super {
      protected def f() { println("f") }
   }
   
   class Sub extends Super {
      f()
   }
   
   class Other {
      (new Super).f() // Error: f is not accessible
   }
}

//scope of protection
package society {
   package professional {
      class Executive {
         private[professional] var workDetails = null
         private[society] var friends = null
         private[this] var secrets = null

         def help(another : Executive) {
            println(another.workDetails)
            println(another.secrets) //ERROR
         }
      }
   }
}*/