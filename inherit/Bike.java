package inherit;

class Motor{
    Long values;

    public Motor() {
        System.out.println("Motor cuntructor");
    }

    public Motor(Long values) {
        this.values = values;
        System.out.println("Motor  param cuntructor");

    }
}

class Machine extends  Motor{
Long values;

    public Machine(Long values) {
        super(values);
        this.values = values;

    }
}

public class Bike {
    public static void main(String[] args) {
        Machine machine= new Machine(422L);

    }

}
