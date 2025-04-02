public class BankAccount {
    String AccountHolder;
    int AccountNumber;
    double Balance;
    BankAccount(String AccountHolder, int AccountNumber, double Balance){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    void Deposit(double money){
        Balance += money;
        System.out.println("The money after deposit:" + Balance);
    }
    void Withdraw(double money){
        if (Balance < money){
            System.out.println("No sufficient Money");
        }else{
            Balance -= money;
        }
    }
    void displayCurrentBalance(){
        System.out.println("Current Balance:" + Balance);
    }
    public static void main(String[] args){
        BankAccount customer = new BankAccount("ABHINAYA" , 23456, 5000);
        customer.Deposit(2000);
        customer.Withdraw(4000);
        customer.displayCurrentBalance();
    }

}
