
public class stringCleaniningHTMLtags {
	public static void main(String[] args) {
		String input= "hi  <bold>how are you?</ bold>honey.";
		String st =input;
		
		//find the occurrance of <
		
		int start = 0; int end=0;
		start =	st.indexOf("<");		
		String ans="";
		while (st.contains(">")||st.contains("<") ) {		
				start =	st.indexOf("<");//new start
				end = st.indexOf(">");
				String temp= st.substring(0,end);
				ans=ans+temp.split("<")[0];
				
				System.out.println("_____1___"+st);//
				System.out.println("___@_"+ans);
				st= st.substring(end+1);// new st for next loop	
				System.out.println("_____>>>"+st);//
		}//for	
		
		ans= ans+st;// last word is also appended after loop exit
		System.out.println("___@_"+ans);
	}

}
