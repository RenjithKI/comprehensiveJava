package java8Time;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class LocalDate1 {

   public static void main( String args[] ) {     
      System.out.println("time exercise starts..."); 
      LocalDate date2 = LocalDate.now(); 
      System.out.println("now..."+ date2);
      
      LocalDate feb29 = LocalDate.of(2000,2,29);
      
      System.out.println("time exercise starts..."+ feb29);
      System.out.println("time exercise starts..."+ feb29.toString());
      
      System.out.println("2000,2,29 +1 yyyy ..."+ feb29.plusYears(1));
      System.out.println("2000,2,29 + 4 yyyy ..."+ feb29.plusYears(4));
      System.out.println("2000,2,29 +1*4 yyyy ..."+ feb29.plusYears(1*4));
      
//      System.out.println("time exercise starts..."+ feb29);
//      System.out.println("time exercise starts..."+ feb29.toString());
   }
}