package inherit;


class Animal{

    String name;

    public Animal(String name) {
        System.out.println("In animal");
        this.name = name;
    }

    public void show(){
        System.out.println("Animal show");
    }
}


class Dog extends Animal{

    String name;

    public Dog(String name) {

        super(name);

        this.name=name;
        System.out.println("In Dog ");
    }

    public void show(){
        super.show();
        System.out.println("Dog show");

    }
}




public class Walk {
    public static void main(String[] args) {
        Animal animal= new Dog("coco");
        animal.show();
    }
}
