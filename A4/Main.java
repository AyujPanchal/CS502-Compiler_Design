import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new PoohTJ(System.in).Goal();
         DepthFirstVisitor vv = new DepthFirstVisitor();
         root.accept(vv); // Your assignment part is invoked here.      
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
