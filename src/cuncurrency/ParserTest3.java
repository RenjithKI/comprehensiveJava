package cuncurrency;
public class ParserTest3 {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ParserTest3.this.x);
        }
    }

    public static void main(String... args) {
        ParserTest3 st = new ParserTest3();
        ParserTest3.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}