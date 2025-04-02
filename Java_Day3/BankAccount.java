public class BankAccount{
    static String bankName = "Union";
    final int accountNumber;
    String accountHolderName;
    static int totalAccounts = 0;
    BankAccount(int accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }
    static void getTotalAccount(){
        System.out.println("Total Accounts:" + totalAccounts);
    }
    void displaydetails(){
        System.out.println("Bank Name:" + bankName);
        System.out.println("Account number:" + accountNumber);
        System.out.println("Name of the Account Holder:" + accountHolderName);
    }
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(12345, "Abhinaya");
        BankAccount b2 = new BankAccount(2345, "Sasanka");
        if(b1 instanceof BankAccount){
            System.out.println("B1 is instance of Bank Account");
            b1.displaydetails();
        }else{
            System.out.println("B1 is not instance of Bank Account");
        }
        System.out.println("Details of another account:");
        b2.displaydetails();
        BankAccount.getTotalAccount();
    }
}

    