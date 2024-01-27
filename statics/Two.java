package statics;

public class Two {

    static int x = 10;
    static int j=20;
    static {
        m1();
        System.out.println("static block");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }


    public static void m1() {
        System.out.println(j);
    }

}
