package java8Time;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class ZonedDateTime11 {

   public static void main( String args[] ) {     
      System.out.println("time exercise starts..."); 
      ZonedDateTime date2 = ZonedDateTime.now(); 
      System.out.println("now..."+ date2);
      
      ZonedDateTime feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 0, null);
      
      System.out.println("time exercise starts..."+ feb29);
      System.out.println("time exercise starts..."+ feb29.toString());
      
      System.out.println("2000,2,29 +1 yyyy ..."+ feb29.plusYears(1));
      System.out.println("2000,2,29 + 4 yyyy ..."+ feb29.plusYears(4));
      System.out.println("2000,2,29 +1*4 yyyy ..."+ feb29.plusYears(1*4));
      
//      System.out.println("time exercise starts..."+ feb29);
//      System.out.println("time exercise starts..."+ feb29.toString());
   }
}