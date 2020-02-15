
public class stringClasstest2 {
	public static void main(String[] args) {
		String st= "hi  <bold>how are you?</ bold>honey.";
		
		//find the occurrance of <
		
		int start = 0; int end=0;
		start =	st.indexOf("<");
		
		
		String ans="";
		while  (st.contains("<") ) {		
		
				start =	st.indexOf("<");//new start
				end = st.indexOf(">");
				
				ans = ans + st.substring(0, start);
				st= st.substring(end);
				
				System.out.println("________"+start+end);//
		
		}//for
		
		
		
		
		
		System.out.println("________"+ans);
	}

}
