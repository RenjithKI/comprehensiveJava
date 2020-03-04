package lambdaComprehensive;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class LambdaDemo {

   public static void main( String args[] ) {     
      System.out.println("lambda starts..."); 
      //      
      MyNumber mynum; //delcare an interface reference
      
      //here the lambda expession is constatnt
      //whe it is assigned to MyNum, a class instance is 
      //constructed in which the lambda expression implements
      // the getValue() method in MyNumber.
      mynum = () -> 123.456;
      
      //call getValue(), which is provided by the previously assigned
      //lambda expression .      
      System.out.println("A fixed value: " + mynum.getValue() );
      
      // here , a more complex expression is used.      
      mynum = () -> Math.random() * 100;      //
      System.out.println("A fixed value: " + mynum.getValue());
      System.out.println("A fixed value: " + mynum.getValue());      
      //
      //a lambda expression must be compatible with the method
      // defined by the functional interface, therefere this won't compile      
//      mynum = () -> "123.456";// error!
      System.out.println("lambda ends...");
   }
}