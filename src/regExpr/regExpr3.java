package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
// USE FIND TO FIND A SEQUENCE 

public class regExpr3 {

   public static void main( String args[] ) {      
      Pattern pat = Pattern.compile("test");
      Matcher mat = pat.matcher("test 1 2 3 test");     
      
      //System.out.println("test 1 2 3 test");     
      
      while (mat.find())  //{
    	  System.out.println("sequence test found at index " + mat.start());
      //}
         
      
   }
}