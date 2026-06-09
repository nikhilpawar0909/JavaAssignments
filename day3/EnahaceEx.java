package day3;

import java.util.ArrayList;

public class EnahaceEx {
    public static void main(String[] args) {
        ArrayList<String > names = new ArrayList<>();

         names.add("nikhil");
        names.add("yash");
        names.add("yashu");
        names.add("adi");

//        for(String name : names){
//            System.out.println("Hello :" +name);
//        }
//        Java 8 For each Loop
        names.forEach(name -> System.out.println("Hello ," +name));
    }
}
