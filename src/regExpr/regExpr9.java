package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @999 cpmprehensive chapter 30*/
// USE FIND TO FIND A SEQUENCE
public class regExpr9 {
	static void method(String st) {
		  Pattern pat = Pattern.compile("[~,]");
//	      Pattern pat = Pattern.compile("e.?+d");
	      String[] strs = pat.split(st);      
	      for (int i = 0; i < strs.length; i++) {
	    	  if (i==0) {
	    		  System.out.println("next token:  " + strs[i]);  
//	    		  break;	  
	    		  continue;
	    	  }
	    	  System.out.println("next token:  " + strs[i]);  
		}      
	      System.out.println(" ________________________- ");
	      //}
	}
   public static void main( String args[] ) {   
	   String[] strs = {"SQL_IN~     123,456,789",
			   "SQL_NOTIN~123,",
			   "SQL_IN~",
			   "SQL_NOTIN~789",
			   "IN~123,456,789",
			   	};
	   for (int i = 0; i < strs.length; i++) {
		   method(strs[i]);
	}
	   
    
         
      
   }
}