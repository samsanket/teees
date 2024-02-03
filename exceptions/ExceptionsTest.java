package exceptions;

public class ExceptionsTest {

    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }

    private static int sum(int i, int i1) {


        try {
            return i+i1;
        }catch (Exception e){
            System.out.println("Exception occured ");

        }finally {
            System.out.println("Finally");

        }
    return 0;

    }
}
