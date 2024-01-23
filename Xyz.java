public class Xyz{

    int x = getX();

    public Xyz() {
        System.out.println("Constructor "+this.x);  // after
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Xyz constructor = new Xyz();  //
        System.out.println("main");
    }

    public int getX() {
        System.out.println("method getX"+this.x);  // default value
        return 10;
    }

}
