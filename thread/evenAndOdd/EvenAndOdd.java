package thread.evenAndOdd;

public class EvenAndOdd extends Thread {

    static int coumt = 0;

    Object object;

    public EvenAndOdd(Object object) {
        this.object = object;
    }


    /*
    Use 2 Threads even and Odd
    use syncronized block to maintian the count ++ values and to print th values
    use object.wai() in even and join it using object.notify() in odd syncronized block

     */
    @Override
    public void run() {
        while (coumt < 20) {
            if (coumt % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Even thread is printing " + coumt);

                    coumt++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (coumt % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Odd Thread is printing " + coumt);
                    coumt++;
                    object.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        Object lock= new Object();
        Runnable r1= new EvenAndOdd(lock);
        Runnable r2= new EvenAndOdd(lock);

        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();

    }
}
