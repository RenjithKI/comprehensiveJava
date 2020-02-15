package Exceptions;
public class exceptionStudy4 {
	
	static int method1(int aa) {// throws Exception
		try {
			return method2(aa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int method2(int bb) throws Exception{
		System.out.println("11111");
		System.out.println("11112");
		int ans = bb;
		if (bb==3)
			throw new Exception("some exception");
		System.out.println("111333");
		System.out.println("11144");
		if (bb==6)
			throw new Exception("some exception222");
		System.out.println("11155");
		return ans;
	}

	public static void main(String[] args) {// throws Exception
		// TODO Auto-generated method stub
		for (int i =0; i < 11;i++) {
			int x = method1(i);
			System.out.println(x);
		}

	}

}
