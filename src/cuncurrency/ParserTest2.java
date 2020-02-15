package cuncurrency;
public class ParserTest2 {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ParserTest2.this.x);
        }
    }

    public static void main(String... args) {
        ParserTest2 st = new ParserTest2();
        ParserTest2.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}