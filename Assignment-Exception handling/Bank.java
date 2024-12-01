// 4. Create multiple classes to imitate a bank structure with proper Exception Handling. For eg., if the user tries to withdraw more than
      the balance, throw "InsufficientBalanceException" (created customly)


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal!");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(500.0);  

        try {
            account.deposit(200.0);
            account.withdraw(100.0);
            account.withdraw(700.0);  
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


