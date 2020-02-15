package Exceptions;
public class exceptionStudy {
	
	static int method1(int aa) throws Exception {
		return method2(2);

	}
	
	public static int method2(int bb) throws Exception{
		System.out.println("11111");
		System.out.println("11112");
		int ans = 10;
		if (bb!=2)
			throw new Exception("some exception");
		System.out.println("111333");
		System.out.println("11144");
		if (bb!=1)
			throw new Exception("some exception222");
		System.out.println("11155");
		return ans;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int x = method1(1);
		System.out.println(x);

	}

}
