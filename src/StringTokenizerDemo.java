//demonstrate string tokenizer
import java.util.StringTokenizer;
public class StringTokenizerDemo {

	static String in = "title = Java: The complete Reference;"+
			"author=Shindt;"+
			"publisher=Oracle Press;"+
			"copyright=2019";
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(in,"=;");
		while (st.hasMoreTokens()){
			String key = st.nextToken();
			String value = st.nextToken();
			System.out.println(key +"\t ->" + value + " end..");
		}

	}

}
