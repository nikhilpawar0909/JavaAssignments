package day2;

abstract class AbstractEx {
    abstract void sterio();
}

class Bmw extends AbstractEx{
    @Override
    void sterio() {
        System.out.println("4.5");
        System.out.println("Bose ultra");
        System.out.println("Max 80% volume");
        System.out.println("Total are the 12 speaker in the car");
    }
}
public class MainAbstract {
    public static void main(String[] args) {
        Bmw obj = new Bmw();
        obj.sterio();
    }
}
