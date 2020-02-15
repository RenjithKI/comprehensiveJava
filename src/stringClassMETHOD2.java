import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class stringClassMETHOD2 {
static String cleanAnswerMETHOD(String input){
		//method body		
	
	Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
	Set<Integer> allItems = new HashSet<>();
	Set<Integer> duplicates = Arrays.stream(numbers)
	        .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
	        .collect(Collectors.toSet());
	System.out.println(duplicates); // [1, 4]
		
		return "______________";		
	}


	public static void main(String[] args) {
		String st= "";
		String ans=cleanAnswerMETHOD(st);
		System.out.println(ans);
		
		
	}

}
