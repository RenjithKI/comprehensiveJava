package Num;
/**
 * @author Renjith
 * Write a function which takes an array of integers and returns true if the elements of the array can be divided into 2 groups 
 * whose sums are equal.
For example:
Given the array [2, 5, 3] the function would return true.
The array [2, 5, 3] can be split up into the two groups [5] and [2, 3] whose sums are both 5.
 *
 */
public class NumManipulationExercise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] input = {2, 3,0,1,3,3}; 
		boolean ans =methodReturnAns(input);
		System.out.println(ans);
		// second method
		boolean ans2 =methodReturnAns2(input);
		System.out.println(ans2);
	}
	private static boolean methodReturnAns2(int[] input) {
		// TODO Auto-generated method stub
		int left=0,right=0;
		boolean boole = false;
		for (int i = 0; i < input.length; i++) {
			
			left = left+ input[i];
			right = sumofRight(i+1, input);
			if (left == right){
				boole = true; break;
			}
			
		} 		
		return boole;
	}
	private static int sumofRight(int i, int[] input) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int j = i; j < input.length; j++) {
			
			sum = sum+input[j];
		}
		return sum;
	}
	private static boolean methodReturnAns(int[] input) {
		// TODO Auto-generated method stub
		boolean boo = false;		
		int start = 0, next =0,third=0;		
		for (int i = 0; i < input.length-2; i++) {	
			 start = input[i];
			 next = input[i+1];
			 third = input[i+2];
			 if (start==next+third ||
					 next==start+third||
							 third==next+start){boo=true;break;
				 
			 }			
		}		
		return boo;
	}

}
