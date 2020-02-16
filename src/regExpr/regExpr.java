package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
public class regExpr {

   public static void main( String args[] ) {   
      
      // Create a Pattern object
      Pattern pat;
      Matcher mat;
      boolean found = false ;
      
      pat = Pattern.compile("Java");
      mat = pat.matcher("Java");
      found = mat.matches();// check for a match
      
      System.out.println("Testing Java against Java");     
      
      if (found) {        
         System.out.println("matched!");
      }else {
         System.out.println("NO MATCH");
      }
     
      //*****************
      mat = pat.matcher("Testing Java against Java SE.");
      System.out.println("Testing Java against Java SE.");     
      
      if (mat.matches()) {        
         System.out.println("matched!");
      }else {
         System.out.println("NO MATCH");
      }
     
      
   }
}