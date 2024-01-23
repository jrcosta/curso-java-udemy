package entities;

public class ClassExercicioOOBank {
    
    private int accountNumber;
    private String accountHolder;
    private double balance;
    
    public ClassExercicioOOBank() {
    }
    
    public ClassExercicioOOBank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    
    public ClassExercicioOOBank(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public String getAccountHolder() {
        return this.accountHolder;
    }
    
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount + 5.0;
        } else {
            System.out.println("Invalid amount!");
        }
    }
    
    @Override
    public String toString() {
        return "Account "
            + this.accountNumber
            + ", Holder: "
            + this.accountHolder
            + ", Balance: $ "
            + String.format("%.2f", this.balance);
    }

}
