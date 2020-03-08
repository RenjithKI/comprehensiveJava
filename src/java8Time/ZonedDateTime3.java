package java8Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
/* @392 comprehensive chapter 15*/
public class ZonedDateTime3 {

   public static void main( String args[] ) throws InterruptedException {     
      System.out.println("time exercise starts..."); 
      Stream<String> strm = ZoneId.getAvailableZoneIds().stream();
      strm.skip(100).limit(10).forEach((i) -> System.out.println("___>"+i));
      
      System.out.println("...st.....");
     /* for (int i = 0; i < 5; i++) {
    	  ZonedDateTime date2 = ZonedDateTime.now(); i
          System.out.println("now..."+ date2);
          Thread.sleep(500);	
	}*/
      
      ZonedDateTime feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("UTC"));
      
      feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("Z"));
      
      feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("Z"));
      
      LocalDateTime local = LocalDateTime.now();
      feb29 = local.atZone(ZoneId.of("UTC"));
      
      System.out.println("time exercise starts.feb29.."+ feb29);
      
      
     
   }
}