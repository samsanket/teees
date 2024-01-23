import java.util.Objects;

public class Employee {

    String name;


    String address;

    Long mark;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }



    public Employee(String name, String address, Long mark) {
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name) && Objects.equals(address, employee.address) && Objects.equals(mark, employee.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, mark);
    }

}
