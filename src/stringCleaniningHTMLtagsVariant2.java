import java.util.regex.Pattern;

public class stringCleaniningHTMLtagsVariant2 {
	public static void main(String[] args) {
		String input= "hi  <bold>how are you?</ bold>Ahoney.   #1000000#";
		
		String ans= input;
		
		Pattern p = Pattern.compile("[<](.+?)[/>]");
//		Matcher m = p.matcher("[customtag]String I want to extract[/customtag]");
//		
//		Pattern p1 = Pattern.compile("[customtag](.+?)[/customtag]");
//		Matcher m1 = p.matcher("[customtag]String I want to extract[/customtag]");
		
		ans= ans.replaceAll("[<](.+?)[/>]", "");//
		//ans= ans.replaceAll("[#](.+?)[#]", "");//
//		ans= ans.replaceAll("[#](.+?)", "");//
//		ans= ans.replaceAll("[A]", "");//
		
				
		System.out.println("___@_>>>"+ans);
	}

	
}
