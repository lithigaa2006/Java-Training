package payslip;

public class BankAccount {


	    private String accountHolder;
	    private int accountNumber;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountHolder, int accountNumber, double balance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Deposit
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance = balance + amount;
	            System.out.println("Amount deposited: ₹" + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    // Withdrawal
	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance");
	        } else {
	            balance = balance - amount;
	            System.out.println("Amount withdrawn: ₹" + amount);
	        }
	    }

	    // Check Balance
	    public void checkBalance() {
	        System.out.println("Current Balance: ₹" + balance);
	    }

	    // Getters
	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}
