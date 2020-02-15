package cuncurrency;

public class ExampleStatic {
	 
    private final String name;
 
    static class Inner {
    	private static String name="some name";
    	public Inner(String name) {
    		Inner.name = name;
        }
    	public Inner() { 
    		name="some name";
        }
        public void printName() {
        	System.out.println("_________________________-");
            System.out.println(name);
            System.out.println(ExampleStatic.Inner.name);
            
            System.out.println(ExampleStatic.Inner.name);
        }
    } 
    public ExampleStatic(String name) {
        this.name = name;
    }
 
    public static void main(String[] args) {
    	ExampleStatic ex1 = new ExampleStatic("Joe");
    	ExampleStatic ex2 = new ExampleStatic("Sue");
        
        System.out.println(ex1.name);
        System.out.println(ex2.name);
        System.out.println("_________________________1-");
        ExampleStatic.Inner in1 = new ExampleStatic.Inner();
        System.out.println("in1.name "  + in1.name);
        System.out.println("_________________________2-");
        ExampleStatic.Inner in2 = new ExampleStatic.Inner("ggggg");
        System.out.println(in2.name);
        ExampleStatic.Inner in3 = new ExampleStatic.Inner();
        System.out.println("_________________________3-");
        System.out.println("in1.name "  + in1.name);
        in1.printName();
        in2.printName();
    }
}