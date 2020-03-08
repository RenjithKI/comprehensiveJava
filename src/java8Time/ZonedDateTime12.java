package java8Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class ZonedDateTime12 {

   public static void main( String args[] ) throws InterruptedException {     
      System.out.println("time exercise starts..."); 
      for (int i = 0; i < 5; i++) {
    	  ZonedDateTime date2 = ZonedDateTime.now(); 
          System.out.println("now..."+ date2);
          Thread.sleep(500);	
	}
      
      ZonedDateTime feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("UTC"));
      
      feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("Z"));
      
      feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("Z"));
      
      LocalDateTime local = LocalDateTime.now();
      feb29 = local.atZone(ZoneId.of("UTC"));
      
      System.out.println("time exercise starts.feb29.."+ feb29);
      System.out.println("time exercise starts..feb29."+ feb29.toString());
      
      System.out.println("2000,2,29 +1 yyyy ..."+ feb29.plusYears(1));
      System.out.println("2000,2,29 + 4 yyyy ..."+ feb29.plusYears(4));
      System.out.println("2000,2,29 +1*4 yyyy ..."+ feb29.plusYears(1*4));
      
//      System.out.println("time exercise starts..."+ feb29);
//      System.out.println("time exercise starts..."+ feb29.toString());
   }
}