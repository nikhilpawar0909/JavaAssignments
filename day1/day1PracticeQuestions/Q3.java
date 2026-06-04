package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		for(int i =1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}

}
