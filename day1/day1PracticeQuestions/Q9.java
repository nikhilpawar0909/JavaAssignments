package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Name :");
		String name = scanner.next();
		
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.substring(0,1));
	}

}
