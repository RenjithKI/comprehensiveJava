import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class streamUSe3 {
	
	private static String findDuplicates(int[] input) {
		// TODO Auto-generated method stub
		Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
		Set<Integer> allItems = new HashSet<>();
		Set<Integer> duplicates = Arrays.stream(numbers)
		        .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
		        .collect(Collectors.toSet());
		
		//System.out.println(); // [1, 4]
		return duplicates.toString();
	}
	
	
	public static void main(String[] args) {
		int [] input ={1,2,3,4,56,};
		String ans = findDuplicates(input);
		
		System.out.println(ans); // [1, 4]
		
	}

	

}
