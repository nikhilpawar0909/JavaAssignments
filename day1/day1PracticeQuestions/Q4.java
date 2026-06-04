package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num = scanner.nextInt();
		
		int sum = 0;
		for(int i = 1; i < num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
