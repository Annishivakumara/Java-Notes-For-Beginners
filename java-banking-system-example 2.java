public class BankingSystem {
    public static void main(String[] args) {
        // Define variables for bank account
        String accountHolderName = "Alice";
        int accountNumber = 123456789;
        double balance = 1000.0;
        boolean isActive = true;

        // Print account information
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        //  Using ternanry Opertor
        System.out.println("Account Status: " + (isActive ? "Active" : "Inactive"));

        // Perform some banking operations
        double depositAmount = 500.0;
        balance += depositAmount;
        System.out.println("\nDeposited: $" + depositAmount);
        System.out.println("Updated Balance: $" + balance);

        double withdrawalAmount = 200.0;
        balance -= withdrawalAmount;
        System.out.println("\nWithdrawn: $" + withdrawalAmount);
        System.out.println("Updated Balance: $" + balance);

        // Check if account is overdrawn
        if (balance < 0) {
            System.out.println("\nAlert: Account overdrawn! Current Balance: $" + balance);
        }
    }
}
