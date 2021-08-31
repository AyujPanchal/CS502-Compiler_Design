import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new PoohJ(System.in).Goal();
         root.accept(new GJNoArguDepthFirst()); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
