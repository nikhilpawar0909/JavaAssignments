package day2;

public class HyraricalFather {
	public void property() {
		System.out.println("I have the 10cr property");
	}
}

class daughter extends HyraricalFather{
	public void money() {
		System.out.println("I have the 10cr money");
	}
}
	
class Son extends HyraricalFather{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son objSon = new Son();
		objSon.property();
	}
}


