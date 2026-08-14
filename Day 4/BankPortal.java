package Bank_App;

import java.util.Scanner;

public class BankPortal {

	public static void main(String[] args) {
		System.out.println("---Welcome to Bank Portal!!----");
		System.out.println("Enter the choice to use the service:\n 1-Search for an Account\n 2-Withdrawal\n 3-Login");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		BankService b1 = new BankService();
		switch(choice) {
		case 1:
			System.out.println("Enter the Account number: ");
			long accNo = sc.nextLong();
			try {
				b1.searchAccount(accNo);
			}
			catch(AccountNotFoundException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Enter the amount to withdraw: ");
			float amount = sc.nextFloat();
			try {
				b1.withdrawal(amount);
			}
			catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
			catch(InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Enter the card number: ");
			int cardNo = sc.nextInt();
			System.out.println("Enter the pin: ");
			int pin = sc.nextInt();
			try {
				b1.login(cardNo, pin);
			}
			catch (InvalidPinException e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Invalid Choice!!");
		}

	}

}