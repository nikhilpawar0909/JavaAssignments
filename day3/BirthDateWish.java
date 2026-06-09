package day3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthDateWish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Birth Year");
        int year = sc.nextInt();

        System.out.println("Enter Birth Month");
        int month = sc.nextInt();

        System.out.println("Enter Birth day ");
        int day = sc.nextInt();

        LocalDate birth = LocalDate.of(year, month, day);
        LocalDate current = LocalDate.now();
        Period age = Period.between(birth, current);
        System.out.println("Your Age is :" +age.getYears());
        sc.close();
    }
}
