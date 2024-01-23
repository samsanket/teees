class Student {

    int mark;
    String name;

    Student(){
        this.mark=10;
        this.name="sanket";

    }

    Student(int m,String s){

        this.mark=m;
        this.name=s;
    }
    public static void main(String[] args) {
        Student student=new Student();

        System.out.println(student.mark);
        System.out.println(student.name);

        Student student1= new Student(90,"sarang");
        System.out.println(student1.mark);
        System.out.println(student1.name);
    }
}
