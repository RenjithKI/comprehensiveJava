
public class stringCleaniningHTMLtagsVariant {
	public static void main(String[] args) {
		String input= "hi  <bold>how are you?</ bold>honey.";
		
		String ans= input;
		
		
		String[] del= findChartoDel(ans);
		
		for (String s: del) {
			ans = ans.replace(s, "");
			
		}		
				
		System.out.println("___@_>>>"+ans);
	}

	private static String[] findChartoDel(String ip) {
		String[] ans = new String [ip.split(">").length+1];//added 1 
		String[] frag = ip.split(">");		
		for (String ff: frag) {
			int x =ff.indexOf("<");
	//		ans[]
			
		}
		
		
		
		return ans;
		
	}

}
