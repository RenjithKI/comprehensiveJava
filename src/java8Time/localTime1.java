package java8Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class localTime1 {

   public static void main( String args[] ) {     
      System.out.println("time exercise starts..."); 
      LocalTime date2 = LocalTime.now(); 
      System.out.println("now..."+ date2);
      
      LocalTime feb29 = LocalTime.of(2000,2,29);
      
      System.out.println("time exercise starts..."+ feb29);
      System.out.println("time exercise starts..."+ feb29.toString());
      
      System.out.println("2000,2,29 +1 yyyy ..."+ feb29.plusHours(1));
      System.out.println("2000,2,29 + 4 yyyy ..."+ feb29.plusMinutes(4));
      System.out.println("2000,2,29 +1*4 yyyy ..."+ feb29.plusSeconds(1*4));
      
//      System.out.println("time exercise starts..."+ feb29);
//      System.out.println("time exercise starts..."+ feb29.toString());
   }
}