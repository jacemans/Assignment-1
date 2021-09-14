/**
 * Exception for comparePasswords.
 * Used if two passwords do not match.
 * @author Justin Hixson
 */

public class UnmatchedException extends Exception {

	private static String message = "Passwords do not match";
	
	public UnmatchedException() {
		super(message);
	}
}
