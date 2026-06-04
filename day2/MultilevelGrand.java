package day2;

public class MultilevelGrand {

	public void money() {
		System.out.println("10,00000");
	}
}	
    class Father1 extends MultilevelGrand{
    	public void property() {
    		System.out.println("I have the 10cr property");
    	}
    }
    
    class Son2 extends Father {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son2 obj = new Son2();
		obj.money();
		obj.property();
	}
 }

