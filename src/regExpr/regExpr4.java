package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
// USE FIND TO FIND A SEQUENCE 

public class regExpr4 {

   public static void main( String args[] ) {      
      Pattern pat = Pattern.compile("W+");
      Matcher mat = pat.matcher("W WW WWWW WWW   3 test");     
      
      //System.out.println("test 1 2 3 test");     
      
      while (mat.find())  //{
    	  System.out.println("MATCH  " + mat.group());
      //}
         
      
   }
}