package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first Number :");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter Second Number :");
		int n2 = scanner.nextInt();
		
		System.out.println("Enter third Number :");
		int n3 = scanner.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("Number" +" " + n1 + " " +"is greater");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("Number" +" " + n2 + " " +"is greater");
		}
		else {
			System.out.println("Number" +" " + n3 + " " +"is greater");
		}
		

	}

}
