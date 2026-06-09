package day3;

interface Demo2{
    void show();
}
public class Java8Ex {
    public static void main(String[] args) {
        Demo2 d = () -> {
            System.out.println("hello");
        };
        d.show();
    }
}
