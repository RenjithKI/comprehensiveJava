package lambdaComprehensive;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @392 comprehensive chapter 15*/
public class LambdaDemo21 {

   public static void main( String args[] ) {     
      System.out.println("lambda starts..."); 
     
      //here the lambda expession test number is even or not : boolean
      String[]  fruitsFamily = {"chakka", "manga", "thega"};
      List<String> list = Arrays.asList(fruitsFamily);
      NumericTest21 isFruits = (n) -> list.contains(n);
    	  
      String[]  kizanguFamily = {"ginger", "tapioca", "chembu"};
      List<String> list2 = Arrays.asList(kizanguFamily);
      NumericTest21 isRoot = (n) -> {boolean boo = false; 
      if (n == null) return false;
      n = n.toLowerCase();
      System.out.println("**************");
      boo = list2.contains(n.trim());  return boo;};
      //lambda expression .      
      if (isFruits.test("chakka")) System.out.println("chakka is fruits");       
      if (isRoot.test("ginger")) System.out.println("ginger is fruits");
      System.out.println("ginger is isRoot   "+isRoot.test("gingeR  "));  
      if (isFruits.test("thega")) System.out.println("thega is fruits");     

      System.out.println("lambda ends...");
      
      
      list.stream().forEach(r -> System.out.println(isFruits.test(r)));
      
      
   }
}