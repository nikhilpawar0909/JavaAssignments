package day2.PracticeQ;
class Vehicle{
    void start(){
        System.out.println("The car is started now...!");
    }
}

class Car extends Vehicle{
    void on(){
        System.out.println("Calling the Parent class method");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.on();
    }
}
