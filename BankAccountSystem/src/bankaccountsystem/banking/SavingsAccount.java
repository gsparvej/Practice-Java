
package bankaccountsystem.banking;

import java.util.Scanner;


public class SavingsAccount extends BankAccount {

    private double sInterestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double sInterestRate) {
        this.sInterestRate = sInterestRate;
    }

    public SavingsAccount(double sInterestRate, String accountNo, double balance) {
        super(accountNo, balance);
        this.sInterestRate = sInterestRate;
    }

    public double getsInterestRate() {
        return sInterestRate;
    }

    public void setsInterestRate(double sInterestRate) {
        this.sInterestRate = sInterestRate;
    }

    @Override
    public double setBalance(double balance) {
       Scanner s=new Scanner(System.in);
        System.out.print("Enter Your New Deposit Amount : ");
        double amount=s.nextDouble();
        balance+=amount;
        System.out.println(" "+balance);
        
        return balance;
        
    }

    @Override
    public double getBalance() {
//        Scanner s=new Scanner(System.in);
//        System.out.print("Enter Your New Deposit Amount : ");
//        double amount=s.nextDouble();
//        balance+=amount;
        
     //   return setBalance(balance);
     
     return balance;
        
        
    }
    

    @Override
    public void getDeposit() {
      //  setBalance(sInterestRate);
      double result;
      //getBalance();
      
      result=setBalance()*0.5;
        
      
        System.out.println("now ; "+result);
        
        
    }

    private double setBalance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    
    
}
