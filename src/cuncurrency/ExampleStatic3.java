package cuncurrency;

public class ExampleStatic3 {
	 
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
            System.out.println(ExampleStatic3.Inner.name);
            
            System.out.println(ExampleStatic3.Inner.name);
        }
    } 
    public ExampleStatic3(String name) {
        this.name = name;
    }
 
    public static void main(String[] args) {
    	ExampleStatic3 ex1 = new ExampleStatic3("Joe");
    	ExampleStatic3 ex2 = new ExampleStatic3("Sue");
        
        System.out.println(ex1.name);
        System.out.println(ex2.name);
        System.out.println("_________________________1-");
        ExampleStatic3.Inner in1 = new ExampleStatic3.Inner();
        System.out.println("in1.name "  + in1.name);
        System.out.println("_________________________2-");
        ExampleStatic3.Inner in2 = new ExampleStatic3.Inner("ggggg");
        System.out.println(in2.name);
        System.out.println("_________________________3-");
        System.out.println("in1.name "  + in1.name);
        in1.printName();
        in2.printName();
    }
}