package day1;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdTask obj = new ThirdTask();
		obj.EvenOrOdd(2);
	}

	public void EvenOrOdd(int a) {
		if(a % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
}
