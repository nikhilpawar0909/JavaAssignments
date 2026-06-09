package day3;

class CoffeMakingEx extends Thread {
    public void run(){
        try {
            System.out.println("Boiling Water..😎");
            Thread.sleep(2000);

            System.out.println("Add Milk...!");
            Thread.sleep(2000);

            System.out.println("Add coffe Powder...!");
            Thread.sleep(2000);

            System.out.println("Add Suger..!");
            Thread.sleep(2000);

            System.out.println("Keep boil for 5 min..!");
            Thread.sleep(2000);

            System.out.println("Coffe is Ready..!");
        }
        catch (InterruptedException e){
//            e.printStackTrace();
        }

    }
}

class CoffeMaking{
    public static void main(String[] args) {
        CoffeMakingEx t = new CoffeMakingEx();
        t.start();
    }
}
