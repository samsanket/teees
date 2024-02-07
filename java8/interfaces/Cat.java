package java8.interfaces;

public interface Cat {

    default void prints(){
        System.out.println("*****");
    }
    static void todo(){
        System.out.println("88888");
    }
}
