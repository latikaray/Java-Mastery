//Challenge 78 : Encapsulation
//Create a class BankAccount with private fields for account number, account holder name, and balance
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void printDetails() {
        System.out.println("Account: " + accountNumber + ", Name: " + accountHolderName + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456", "Latika", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500); // Invalid
        acc.printDetails();
    }
}
