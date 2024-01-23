package java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // to get the rank in between 50 to 100
        List<Student> rankInBetween = studentList.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList());
//        rankInBetween.forEach(System.out::println);

        // find the student from karnataka and sort it by name
        List<Student> findByKarnatakaAndSort = studentList.stream().filter(student -> student.getCity() == "Karnataka").sorted(Comparator.comparing(Student::getFirstName).reversed()).collect(Collectors.toList());
//        findByKarnatakaAndSort.forEach(System.out::println);

        // find all unique department names
        List<String> departmentNames = studentList.stream()
                        .map(Student::getDept).distinct()
                .toList();

//        departmentNames.forEach(System.out::println);

        // find all contacts
       List<List<String>> listStream = studentList.stream()
                .map(student -> student.getContacts()).toList();

//        listStream.forEach(System.out::println);

        //find contcts one to one mappings

        List<String> studnetPhoneNumber = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());
//        studnetPhoneNumber.forEach(System.out::println);

        //group the student by their department

      Map<String,List<Student>> studentByNameMap=studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));
//      studentByNameMap.entrySet().forEach(System.out::println);

      // group by student key->department values -> count of student
        Map<String, Long> collectedResults = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
//        collectedResults.entrySet().forEach(System.out::println);

        // get the max value of number of students
        Map.Entry<String, Long> collectedMaxStundetResult = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
//        System.out.println(collectedMaxStundetResult);


        // find the average of male and female student
       Map<String, Double> averageMaleFelame = studentList.stream()
                .collect(
                        Collectors.
                                groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));

//       averageMaleFelame.entrySet().forEach(System.out::println);


       // find the highest rank in eact department

        Set<Map.Entry<String, Optional<Student>>> highestRank = studentList.stream().collect(Collectors.groupingBy(Student::getDept
                , Collectors.minBy(Comparator.comparing(Student::getRank)))).entrySet();
                highestRank.forEach(System.out::println);

    }

}
