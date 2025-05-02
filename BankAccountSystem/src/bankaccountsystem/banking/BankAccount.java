
package bankaccountsystem.banking;


public class BankAccount {
    
    private String accountNo;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }
    
    public void getDeposit(){
    
    }
    
    public double getWithdraw(){
    double withdraw = 0;
    
    return withdraw;
    }
    
    public void getDisplayBalance(){
    
    
    
    
    
    }
    
}
