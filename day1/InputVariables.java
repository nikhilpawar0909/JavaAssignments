package day1;

import java.util.Scanner;

public class InputVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input variable
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.next();
		
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		
		System.out.println("Enter your college name :");
		String clg = sc.next();
		
		System.out.println("Enter your blood group :");
		String bld = sc.next();
		
		System.out.println("Enter your address :");
		String ads = sc.next();
		
		System.out.println("your name is :" +name);
		System.out.println( name+"," +" " +"your age is :" +age);
		System.out.println( name+"," +" " +"your college is :" +clg);
		System.out.println( name+"," +" " +"your blood group is :" +bld);
		System.out.println( name+"," +" " +"your address is :" +ads);
	}

}
