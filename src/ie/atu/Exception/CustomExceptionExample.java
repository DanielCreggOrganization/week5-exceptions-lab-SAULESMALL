package ie.atu.Exception;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        try {
            account.withdraw(150); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
