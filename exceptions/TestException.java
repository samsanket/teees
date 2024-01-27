package exceptions;

public class TestException {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();

        }catch (Exception3 exception3){
            System.out.println("Exception3");

        }catch (Exception2 exception2){
            System.out.println("Exception2");

        }catch (Exception1 exception1){
            System.out.println("Exception1");

        }catch (RuntimeException runtimeException){
            System.out.println("RunTime ");
        }catch (Exception exception){
            System.out.println("MAIN EXCEPTION");

        }
    }
}
