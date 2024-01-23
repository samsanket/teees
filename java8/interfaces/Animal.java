package java8.interfaces;

public class Animal implements Dog,Cat{

    @Override
    public void prints() {
        Cat.super.prints();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.prints();
        Dog.todo();
        Cat.todo();

    }

}
