package day3;

class MyThread extends Thread{
   public void run(){
       for(int i = 0; i < 5; i++){
           System.out.println("Thread is running...!");
       }
   }
}
public class MultiThreadingEx {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
