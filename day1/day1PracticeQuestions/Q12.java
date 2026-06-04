package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.next();
		
		int arr[] = new int[5];
		System.out.println("Enter your 5 subjects marks ");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter subject mark : ");
			arr[i] = scanner.nextInt();
	   }
	    
		int totalMarks = 0;
		for(int i = 0; i < 5; i++) {
			totalMarks += arr[i];
		}
		
		System.out.println("So, Your total marks are :" +totalMarks);
		
		if(totalMarks > 75) {
			System.out.println("You got the Grade : Distinction");
		}
		else if(totalMarks > 60 && totalMarks < 75) {
			System.out.println("You got the Grade : First Class");
		}
		else if(totalMarks > 40 && totalMarks < 60) {
			System.out.println("You got the Grade : First Class");
		}
		else {
            System.out.println("Fails");
		}

	}

}
