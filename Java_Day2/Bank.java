class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private int balance;
    BankAccount(int accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void setbalance(int balance){
            this.balance = balance;
    }
    static int getbalance(int balance){
        return balance;
    }
    void displayBankDetails(){
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Account Holder name:" + accountHolder);
        System.out.println("Balance:" + balance);
    }
}
class SavingsAccount extends BankAccount{
    String bankName;
    SavingsAccount(int accountNumber, String accountHolder, int balance, String bankName){
        super(accountNumber, accountHolder, balance);
        this.bankName = bankName;
    }
    @Override
    void displayBankDetails(){
        super.displayBankDetails();
    }
}
class Bank{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(123, "Abhi",10000);
        b1.displayBankDetails();
        System.out.println("The updated:"+ BankAccount.getbalance(20000));
        SavingsAccount s1 = new SavingsAccount(1234, "Sasanka", 1000, "Union");
        s1.displayBankDetails();       
 }
}
        
            
        
            