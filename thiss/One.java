package thiss;


public class One {

    int id;
    String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public One(int name, String address) {
        this.id = name;
        this.address = address;
    }

    public static void printData(int x,String y){
        System.out.println("values are "+x );
        System.out.println("Valeus are "+ y);
    }

    public void main() {
        One one= new One(1,"pune");

        one.printData(this.id,this.address);
    }

    public One() {
    }

    public static void main(String[] args) {
       One one= new One();
            one.main();
    }

}
