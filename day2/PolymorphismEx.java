package day2;

class MathOperations{
//    Method Overloading
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        obj.add(2, 3);
        obj.add(2, 3, 5);
    }
}
