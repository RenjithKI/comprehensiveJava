package lambdaComprehensive;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class LambdaDemo3 {

   public static void main( String args[] ) {     
      System.out.println("lambda starts..."); 
     
      //here the lambda expession test number is even or not : boolean
      NumericTest isEven = (n) -> (n % 2)==0;
      
      //call getValue(), which is provided by the previously assigned
      //lambda expression .      
      if (isEven.test(10)) System.out.println("10 is even...");       
      if (isEven.test(9)) System.out.println("9 is even...");
      if (isEven.test(0)) System.out.println("0 is even...");
      
      // now, use a lambda expression that test if a number 
      // is non negative           

      System.out.println("lambda ends...");
      
      NumericTest isNonNeg = (n) -> (n % 2)==0;
      
      //call getValue(), which is provided by the previously assigned
      //lambda expression .      
      if (isEven.test(-10)) System.out.println("-10 is even...");       
      if (isEven.test(9)) System.out.println("9 is even...");
      if (isEven.test(0)) System.out.println("0 is even...");
   }
}