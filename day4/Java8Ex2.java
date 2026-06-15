package day4;

import java.util.ArrayList;

public class Java8Ex2 {
    public static void main(String[] args) {
        ArrayList<String > names = new ArrayList<>();

        names.add("nikhil");
        names.add("yash");
        names.add("yashu");
        names.add("adi");

        names.stream().filter(name -> name.startsWith("a"))
                .forEach(name -> System.out.println("Hello, "+name));
    }
}
