package day1.day1PracticeQuestions;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        int arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the Number : ");
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The maximum Number is : " +max);
		
}

}
