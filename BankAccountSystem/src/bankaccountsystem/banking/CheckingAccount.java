
package bankaccountsystem.banking;



public class CheckingAccount extends BankAccount {
    
    private double cOverDraftLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(double cOverDraftLimit) {
        this.cOverDraftLimit = cOverDraftLimit;
    }

    public CheckingAccount(double cOverDraftLimit, String accountNo, double balance) {
        super(accountNo, balance);
        this.cOverDraftLimit = cOverDraftLimit;
    }
    
    
    
}
