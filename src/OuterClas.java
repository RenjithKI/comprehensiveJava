
public class OuterClas {
	String hi ;
	int num;
	
    public String getHi() {
		return hi;
	}
	public void setHi(String hi) {
		this.hi = hi;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	static class StaticNestedClass extends  OuterClashelloworldtoExtend{
		public static String sysoutme() {
		//System.out.println("in static class");
			return "jjjj";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sysoutme();
		System.out.println(returnWordFrom());

	}

}
}
