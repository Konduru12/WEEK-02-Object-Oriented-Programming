abstract class BankAccount{
    int accountNumber;
    String holderName;
    int balance;
    BankAccount(int accountNumber, String holderName, int balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public double deposit(double amount){
        return amount;
    }
    public abstract int calculateInterest();
    public void displayBankDetails(){
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Name of the Account holder:" + holderName);
        System.out.println("Balance:" + balance);
    }
}
interface Loanable{
    void applyForLoan();
    void calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(int accountNumber, String holderName, int balance){
        super(accountNumber, holderName, balance);
    }
    public int calculateInterest(){
        return (int)(balance*0.02);
    }
    public void applyForLoan(){
        System.out.println("Loan Submitted successfully");
    }
    public void calculateLoanEligibility(){
        if(balance <= 5000){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
    public void displayBankDetails(){
        super.displayBankDetails();
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    CurrentAccount(int accountNumber, String holderName, int balance){
        super(accountNumber, holderName, balance);
    }
    public int calculateInterest(){
        return (int)(balance*0.10);
    }
    public void applyForLoan(){
        System.out.println("Loan Submitted successfully");
    }
    public void calculateLoanEligibility(){
        if(balance <= 10000){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
    public void displayBankDetails(){
        super.displayBankDetails();
    }
}
public class BankingSystem {
    public static void main(String[] args){
        SavingsAccount s1 = new SavingsAccount(34123, "Abhinaya", 2000);
        CurrentAccount c1 = new CurrentAccount(32415, "Sasanka", 5000);
        s1.displayBankDetails();
        s1.calculateInterest();
        s1.applyForLoan();
        s1.calculateLoanEligibility();
        c1.displayBankDetails();
        c1.calculateInterest();
        c1.applyForLoan();
        c1.calculateLoanEligibility();
    }
}
