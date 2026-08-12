package payslip;
import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Account Holder Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Account Number: ");
		        int accountNumber = sc.nextInt();

		        System.out.print("Enter Initial Balance: ");
		        double balance = sc.nextDouble();

		        // Creating object using constructor
		        BankAccount account = new BankAccount(name, accountNumber, balance);

		        int choice;

		        do {
		            System.out.println("\n----- BANK ENTERPRISE -----");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Account Details");
		            System.out.println("5. Exit");

		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    System.out.print("Enter deposit amount: ");
		                    double depositAmount = sc.nextDouble();
		                    account.deposit(depositAmount);
		                    break;

		                case 2:
		                    System.out.print("Enter withdrawal amount: ");
		                    double withdrawAmount = sc.nextDouble();
		                    account.withdraw(withdrawAmount);
		                    break;

		                case 3:
		                    account.checkBalance();
		                    break;

		                case 4:
		                    System.out.println("\nAccount Holder: "
		                            + account.getAccountHolder());
		                    System.out.println("Account Number: "
		                            + account.getAccountNumber());
		                    System.out.println("Balance: ₹"
		                            + account.getBalance());
		                    break;

		                case 5:
		                    System.out.println("Thank you for using Bank Enterprise.");
		                    break;

		                default:
		                    System.out.println("Invalid choice");
		            }

		        } while (choice != 5);

		        sc.close();
		    }
		}
	
