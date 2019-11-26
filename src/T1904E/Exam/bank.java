package T1904E.Exam;

import java.util.Scanner;

public class bank {
    private double balance;
    private double rate;

    public bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public void calculateInterest(){
        double interest = this.balance * (this.rate/1200);
        System.out.println("Interest: "+interest);

    }

    public static void main(String[] args){
        bank b = new bank(2000,600);
        b.calculateInterest();
    }
}
