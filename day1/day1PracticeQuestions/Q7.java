package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the Number : ");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}

}
