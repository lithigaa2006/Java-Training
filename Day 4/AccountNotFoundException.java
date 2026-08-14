package Bank_App;
class AccountNotFoundException extends Exception{
	public AccountNotFoundException(String msg){
		super(msg);
	}
}