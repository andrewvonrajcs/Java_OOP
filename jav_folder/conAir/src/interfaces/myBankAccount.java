package interfaces;

public class myBankAccount implements inter  {
    public void addInterest() {
        double i = .50;
        System.out.println(i);
    }
    public static void main(String[] args) {
        myBankAccount my = new myBankAccount();
        my.addInterest();
    }
}