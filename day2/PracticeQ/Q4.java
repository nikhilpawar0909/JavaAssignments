package day2.PracticeQ;

class BankAccount{
    private int balance;

    void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
}
public class Q4 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setBalance(10000);

        System.out.println("The balance Score is :" +obj.getBalance());
    }
}
