package cuncurrency;
public class ParserTest {
    public int x = 0;
    
    class FirstLevel {
        public int x = 1;
        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);            
            System.out.println("this.x = " + this.x);
            System.out.println("f1.x = " + x);
            System.out.println("ShadowTest.this.x = " + ParserTest.this.x);
        }
    }
    
    class FirstLevelSibling {
        public int x = 111;
        void methodInFirstLevelSibling(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ParserTest.this.x);
        }
    }
    
    void methodInMain(int x) {
        System.out.println("methodInMain x = " + x);
        System.out.println("_______________________main-"+ this.x);
        System.out.println("this.x = " + this.x);
        System.out.println("ShadowTest.this.x = " + ParserTest.this.x);
        System.out.println("________answer_______________-"+x);
    }

    public static void main(String... args) {
    	int x =100;
    	
        ParserTest st = new ParserTest();
        ParserTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
        System.out.println("_______________________-"+x);
        st.methodInMain(23);
        System.out.println("_______________________-");
        ParserTest.FirstLevel fl11 = st.new FirstLevel();
        fl11.methodInFirstLevel(33);
    }
}