package cuncurrency;

public class Example {
	 
    private final String name;
 
    class Inner {
    	private String name="some name";
    	public Inner(String name) {
            this.name = name;
        }
    	public Inner() {
            this.name = name;
        }
        public void printName() {
            System.out.println(Example.this.name);
            System.out.println(Example.Inner.this.name);
            System.out.println("_________________________-");
           
        }
    } 
    public Example(String name) {
        this.name = name;
    }
 
    public static void main(String[] args) {
        Example ex1 = new Example("Joe");
        Example ex2 = new Example("Sue");
        
        System.out.println(ex1.name);
        System.out.println(ex2.name);
 
        final Inner inner1 = ex1.new Inner();
        final Inner inner2 = ex2.new Inner("differ name");
 
        inner1.printName();
        inner2.printName();
    }
}