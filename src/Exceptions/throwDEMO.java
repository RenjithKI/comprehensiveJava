package Exceptions;
public class throwDEMO {
	
	static void demoProcedure(){// 
		try {
			throw new NullPointerException("null-except") ;
		} catch (NullPointerException e) {			
			e.printStackTrace();
			System.out.println("e is cought in method but rethrown...");
			throw e;
		}
	}
	

	public static void main(String[] args) throws Exception {// 
		System.out.println("ans is ");
		try {
			demoProcedure() ;
		} catch (NullPointerException e) {
			System.out.println("recought exception here"+ e);
			e.printStackTrace();
		}
		System.out.println("ans is = ");

	}

}
