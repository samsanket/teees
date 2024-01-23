package java8.interfaces;

public interface Dog {
    default void prints(){
        System.out.println("#####");
    }

   static void todo(){
        System.out.println("9999");
    }
}
