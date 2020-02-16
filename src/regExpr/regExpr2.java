package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
// USE FIND TO FIND A SEQUENCE 

public class regExpr2 {

   public static void main( String args[] ) {      
      Pattern pat = Pattern.compile("Java");
      Matcher mat = pat.matcher("Java SE");     
      
      System.out.println("looking /finding  Java against Java");     
      
      if (mat.find())  System.out.println("sequence found with find() method!");
      else	System.out.println("NO MATCH");    
      
   }
}