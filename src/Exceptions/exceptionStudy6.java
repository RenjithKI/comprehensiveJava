package Exceptions;
public class exceptionStudy6 {
	
	static int method1(int aa) {// 
		try {
			return method2(aa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 00;
	}
	
	public static int method2(int bb) throws Exception{
		System.out.println("11111");
		System.out.println("11112");
		int ans = bb;
		if (bb==1)
			return 0;
			//throw new Exception("some exception");
		System.out.println("111333");
		System.out.println("11144");
		if (bb==6){
			throw new Exception("some exception222");}
		System.out.println("11155");
		return ans;
	}

	public static void main(String[] args) throws Exception {// 
		// TODO Auto-generated method stub
		for (int i =0; i < 11;i++) {
			int x = method1(i);
			System.out.println("ans is = " + x);
		}

	}
	/*Exception in thread "main" java.lang.Exception: some exception222
	at exceptionStudy5.method2(exceptionStudy5.java:18)
	at exceptionStudy5.method1(exceptionStudy5.java:5)
	at exceptionStudy5.main(exceptionStudy5.java:26)
	************************
	*
	*java.lang.Exception: some exception222
	at exceptionStudy6.method2(exceptionStudy6.java:24)
	at exceptionStudy6.method1(exceptionStudy6.java:6)
	at exceptionStudy6.main(exceptionStudy6.java:32)
	*/

}
