package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
// USE FIND TO FIND A SEQUENCE 

public class regExpr71 {

   public static void main( String args[] ) {      
      Pattern pat = Pattern.compile("[A-Za-z0-9]+");
//      Pattern pat = Pattern.compile("e.?+d");
      Matcher mat = pat.matcher("extend cup end12 table.!% ");      
      while (mat.find())  //{
    	  System.out.println("MATCH:  " + mat.group());
     //
      pat = Pattern.compile("[A-Za-z0-9_]~+");
       mat = pat.matcher("SQL_IN~123,456,789 SQL_NOTIN~123,456,789");      
      while (mat.find())   System.out.println("MATCH:  " + mat.group());     
      
      System.out.println(" with ? shortest matching pattern obtained ");
      //}
         
      
   }
}