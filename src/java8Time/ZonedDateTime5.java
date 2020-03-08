package java8Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
/* @392 comprehensive chapter 15*/
public class ZonedDateTime5 {

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
      ZonedDateTime date2 = ZonedDateTime.now();
      System.out.println("NOWWWW..now..."+ date2);
      System.out.println("now..date2.getOffset()....."+ date2.getOffset());
      
      ZonedDateTime feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("UTC"));
      
      feb29 = ZonedDateTime.of(2000,2,29, 0, 0, 0, 999999, //lat one nano seconds
    		  ZoneId.of("Z"));
      System.out.println("time exercise starts.feb29.."+ feb29);    
      
      LocalDateTime local = LocalDateTime.now();
      feb29 = local.atZone(ZoneId.of("UTC"));
      
      ZonedDateTime appollolaunch = ZonedDateTime.of(1969,7,16, 9, 32, 0, 0, //lat one nano seconds
    		  ZoneId.of("America/New_York"));
            
      System.out.println("time exercise ....appollolaunch.."+ appollolaunch);
      
      Instant inst = appollolaunch.toInstant();
      
      System.out.println("time exercise ....appollolaunch.."+ appollolaunch.toInstant());
      System.out.println("time exercise ....appollolaunch... to UTC time>"+ inst.atZone(ZoneId.of("UTC")));
      
     
   }
}