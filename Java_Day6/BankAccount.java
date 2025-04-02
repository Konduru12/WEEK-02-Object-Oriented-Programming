public class BankAccount{
    private String accountNumber;
    private int balance;
    BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    
    public void setBalance(int balance){
        if(balance>=0){
            this.balance = balance;
        }else{
            System.out.println("Balance cannot be Negative.");
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Deposit amount must be Positive.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Invalid Withdraw amount.");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Current Balance:" + balance);
    }

    public static void main(String[] args){
        BankAccount b1 = new BankAccount("123456", 1000);
    
    
        b1.deposit(2000);
    
        b1.withdraw(1500);
        b1.displayAccountInfo();

    }
}