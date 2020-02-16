package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
// USE FIND TO FIND A SEQUENCE 

public class regExpr6 {

   public static void main( String args[] ) {      
      Pattern pat = Pattern.compile("e.+?d");
//      Pattern pat = Pattern.compile("e.?+d");
      Matcher mat = pat.matcher("extend cup end table ");     
      
      //System.out.println("test 1 2 3 test");     
      
      while (mat.find())  //{
    	  System.out.println("MATCH:  " + mat.group());
      System.out.println("? ");
      System.out.println(" with ? shortest matching pattern obtained ");
      //}
         
      
   }
}