import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class streamUSe2 {
	
	private static String findDuplicates(int[] input ) {
		
		//Integer[] Iarray= intTOIntegerArray(input);
		// TODO Auto-generated method stub
		//Integer[] numbers = new Integer[input];
		Integer[] numbers = intTOIntegerArray(input);
		sysoutcontent(numbers);
		
		Set<Integer> allItems = new HashSet<>();
		Set<Integer> duplicates = Arrays.stream(numbers)
		        .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
		        .collect(Collectors.toSet());
		
		//System.out.println(); // [1, 4]
		return duplicates.toString();
	}
	
	
	private static void sysoutcontent(Integer[] numbers) {
		// TODO Auto-generated method stub
		for (int a: numbers)
			System.out.println(a);
	}


	private static Integer[] intTOIntegerArray(int[] oldArray) {
		// TODO Auto-generated method stub
		// Here you would assign and fill oldArray
		Integer[] newArray = new Integer[oldArray.length];
		int i = 0;
		for (int value : oldArray) {
		    newArray[i++] = Integer.valueOf(value);
		}		
		//
		return newArray;
	}


	public static void main(String[] args) {
		int [] input ={1,2,3,4,56,3,1};
		String ans = findDuplicates(input);
		
		
		System.out.println(ans); // [1, 4]
		
	}

	

}
