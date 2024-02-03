package construtctors;


class A {


    public void print(){
        System.out.println("This is A printing data ");
    }


    public A() {
        System.out.println("This is A");
    }
}

class B extends A {


    public void print(){
        System.out.println("This is B printing data ");
    }

    public B() {
        System.out.println("This is B");
    }
}

class C extends B {

    public void print(){
        System.out.println("This is C printing data ");
    }

    public C() {
        System.out.println("This is C");

    }
}


public class TryOne {
    public static void main(String[] args) {
        A c = new A();
        c.print();

    }
}


