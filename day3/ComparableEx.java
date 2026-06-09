package day3;

import day1.ArrayListEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(90, "Nikhil"));
        list.add(new Student(99, "Yash"));
        list.add(new Student(66, "Pokale"));
        list.add(new Student(77, "Gurav"));
        list.add(new Student(88, "Adi"));
        list.add(new Student(98, "tejas"));
        list.add(new Student(99, "yeshuu"));
        Collections.sort(list);
        System.out.println(list);
    }
}
    class Student implements
    Comparable<Student>{
        int marks;
        String name;

        public Student(int marks, String name){
            this.marks = marks;
            this.name = name;
        }

        @Override
        public int compareTo(Student s) {
            return Integer.compare(this.marks, s.marks);
        }

        public String toString(){
            return marks + " " +name;
        }
    }

