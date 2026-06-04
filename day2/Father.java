package day2;

public class Father {
	
	public void money() {
		System.out.println("10,0000");
	}
	
	public void property() {
		System.out.println("15 cr duplex in mumbai");
	}
}

	 class Son1 extends Father {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Son1 akshay = new Son1();
			akshay.money();
			akshay.property();
		}
	}

