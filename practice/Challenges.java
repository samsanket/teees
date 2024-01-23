package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class  Empolyee{
    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private long salary;

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Empolyee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
public class Challenges {


    /*
    *
Employee {

    private int id;

    private String name;

    private int age;

    private long salary;

}

* My query:  we would like to sort based on Salary, then age

*

*/


    public static void main(String[] args) {
        List<Empolyee> empolyees=  new ArrayList<>();
        empolyees.add(new Empolyee(1,"sanket",24,7 ));
        empolyees.add(new Empolyee(2,"vikas",23,6));

      List<Empolyee> res=  empolyees.stream().filter(empolyee -> empolyee.getSalary() >= empolyee.getSalary()).filter(empolyee -> empolyee.getAge()>= empolyee.getAge()).collect(Collectors.toList());


      empolyees.stream().filter(empolyee -> empolyees.stream().filter(empolyee1 -> empolyee.getSalary()>empolyee1.getSalary()).isParallel());


        System.out.println(res.get(0));
        System.out.println(res.get(1));

    }
}
