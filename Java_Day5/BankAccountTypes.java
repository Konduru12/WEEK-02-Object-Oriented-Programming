class BankAccount{
    int accountNumber;
    int balance;
    BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountType(){
        System.out.println("Bank Account");
    }
    void displayBankDetails(){
        System.out.println("Enter the Account Number:" + accountNumber);
        System.out.println("Balance:" + balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber, int balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType(){
        System.out.println("Savings Account");
    }
    void displayBankDetails(){
        super.displayBankDetails();
        System.out.println("Interest rate:" + interestRate);
    }

}
class CheckingAccount extends BankAccount{
    int withdrawalLimit;
    CheckingAccount(int accountNumber, int balance, int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType(){
        System.out.println("Checking Account");
    }
    void displayBankDetails(){
        super.displayBankDetails();
        System.out.println("Withdrawal Limit of this type of Account:"+ withdrawalLimit);
    }
}
public class BankAccountTypes {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(12345, 1500);
        SavingsAccount s1 = new SavingsAccount(123, 13000, 2.5);
        CheckingAccount c1 = new CheckingAccount(123456, 2300, 250);
        b1.displayAccountType();
        b1.displayBankDetails();
        s1.displayAccountType();
        s1.displayBankDetails();
        c1.displayAccountType();
        c1.displayBankDetails();
    }
}
