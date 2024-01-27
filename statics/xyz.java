package statics;

public class xyz{

    int x = getX();

    public xyz() {
        System.out.println(this.x);
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        xyz constructor = new xyz();
        System.out.println("main");
    }

    public int getX() {
        System.out.println(this.x);
        return 10;
    }

}