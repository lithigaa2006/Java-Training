package Bank_App;

public class BankService {
	double currentBalance = 78292;
	long nums[] = {10023,10494,19304};
	void searchAccount(long accNo) throws AccountNotFoundException {
		boolean flag = false;
		for(long num:nums) {
			if(num==accNo) {
				System.out.println("Account Found!!");
				flag=true;
				break;
			}
		}
		if(!flag) {
			throw new AccountNotFoundException("Account Not Found");
		}
	}
	void withdrawal(float amount) throws InsufficientBalanceException, InvalidAmountException{
		if(amount<=0) {
			throw new InvalidAmountException("Minimum Rs.100 must be withdrawn..");
		}
		if(amount>currentBalance) {
			throw new InsufficientBalanceException("Insufficient Balance..");
		}
		currentBalance -= amount;
		System.out.println("Current Balance: "+currentBalance);
	}
	void login(int cardNo,int pin) throws InvalidPinException {
		if(cardNo == 8923) {
			if(pin==20932) {
				System.out.println("Logged in successfully!!");
			}
			else {
				throw new InvalidPinException("Incorrent Pin number!!");
			}
		}
		else {
			System.out.println("Incorrect card number is entered!!");
		}
	}
	
}