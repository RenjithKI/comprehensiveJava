package regExpr;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(.*)(\\d+)(.*)";

      // Create a Pattern object
      Pattern patt = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher matcher = patt.matcher(line);
      if (matcher.find( )) {
         System.out.println("Found value: " + matcher.group(0) );
         System.out.println("Found value: " + matcher.group(1) );
         System.out.println("Found value: " + matcher.group(2) );
      }else {
         System.out.println("NO MATCH");
      }
   }
}