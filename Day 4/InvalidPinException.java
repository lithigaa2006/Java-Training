package Bank_App;

public class InvalidPinException extends Exception {
	public InvalidPinException(String msg)
	{
		super(msg);
	}
}