package Num;

public class template2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
		int ans =returnFactorial(input);
		System.out.println(ans);

	}

	private static int returnFactorial(int input) {
		// TODO Auto-generated method stub
		int ans = 1;
		for (int i = 1; i <= input; i++) {			 
			ans=ans*i;
		}		
		return ans;		
	}

}
