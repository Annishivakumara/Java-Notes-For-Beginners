public class BankingSystem {
    public static void main(String[] args) {
   
        String accountHolderName = "Alice";
        int accountNumber = 123456789;
        double balance = 1000.0;
        boolean isActive = true;

        
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
     
        System.out.println("Account Status: " + (isActive ? "Active" : "Inactive"));

 
        double depositAmount = 500.0;
        balance += depositAmount;
        System.out.println("\nDeposited: $" + depositAmount);
        System.out.println("Updated Balance: $" + balance);

        double withdrawalAmount = 200.0;
        balance -= withdrawalAmount;
        System.out.println("\nWithdrawn: $" + withdrawalAmount);
        System.out.println("Updated Balance: $" + balance);

        if (balance < 0) {
            System.out.println("\nAlert: Account overdrawn! Current Balance: $" + balance);
        }
    }
}
