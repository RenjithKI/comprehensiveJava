package cuncurrency;

public class ExampleStatic2 {
	 
    private final String name;
 
    static class Inner {
    	private static String name="some name";
    	public Inner(String name) {
    		Inner.name = name;
        }
    	public Inner() {           
        }
        public void printName() {
        	System.out.println("_________________________-");
            System.out.println(name);
            System.out.println(ExampleStatic2.Inner.name);
            
            System.out.println(ExampleStatic2.Inner.name);
        }
    } 
    public ExampleStatic2(String name) {
        this.name = name;
    }
 
    public static void main(String[] args) {
    	ExampleStatic2 ex1 = new ExampleStatic2("Joe");
    	ExampleStatic2 ex2 = new ExampleStatic2("Sue");
        
        System.out.println(ex1.name);
        System.out.println(ex2.name);
        System.out.println("_________________________1-");
        ExampleStatic2.Inner in1 = new ExampleStatic2.Inner();
        System.out.println("in1.name "  + in1.name);
        System.out.println("_________________________2-");
        ExampleStatic2.Inner in2 = new ExampleStatic2.Inner("ggggg");
        System.out.println(in2.name);
        System.out.println("_________________________3-");
        System.out.println("in1.name "  + in1.name);
        in1.printName();
        in2.printName();
    }
}