package day2.PracticeQ;

class Person {
    void showName(){
        System.out.println("My Name is Nikhil..!");
    }
}

class Students {
    void myName(){
        System.out.println("My name is Soham, I am Student ");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.myName();
    }
}
