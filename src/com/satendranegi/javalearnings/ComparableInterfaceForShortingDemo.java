package com.satendranegi.javalearnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    int rollNo;
    int marks;
    String name;

    public Student(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name=" + name +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        //return marks>o.marks?1:-1;
        //return name.length()>o.name.length()?1:-1;
        return rollNo>o.rollNo?1:-1;
    }
}

public class ComparableInterfaceForShortingDemo {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,48,"Ramesh"));
        studentList.add(new Student(3,40,"Rahul"));
        studentList.add(new Student(2,78,"Satendra"));
        studentList.add(new Student(4,99,"Chi"));

        Collections.sort(studentList,(i,j)->i.marks>j.marks?1:-1);

        for (Student student : studentList)
            System.out.println(student);


    }
}
