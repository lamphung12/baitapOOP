package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    private String address;
    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    ////////sap xep theo ten AlphaB ////
    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Cam", 20, "Ha Noi");
        Student student2 = new Student("Bam", 25, "Vinh Phuc");
        Student student3 = new Student("Am", 10, "Phu Tho");
        Student student4 = new Student("huy", 30, "Binh Xuyen");
        Student student5 = new Student("huy", 10, "Binh Xu");


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);



        Collections.sort(studentList);
        for (int i = 0; i <studentList.size() ; i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("--------------------");

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

    }
}
