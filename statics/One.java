package statics;

public class One {
    static int x = 10;
    static {
        m1();
        System.out.println("static block");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }

    static int j=20;

    public static void m1() {
        System.out.println(j);
    }
}
