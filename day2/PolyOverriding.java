package day2;
// method overriding

class Father3{
    void marriage(){
        System.out.println("I am married");
    }
}

class Son3 extends Father3 {
    void marriage(){
        System.out.println("I am not married");
    }
}

public class PolyOverriding {
    public static void main(String[] args) {
        Son3 obj = new Son3();
        obj.marriage();
    }
}
