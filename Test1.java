package sts;

public class Test1 {

	public static boolean isValid(final String text) {
		return (text + ".").matches("((([1]\\d\\d)|(2[0-4]\\d)|(25[0-5])|(\\d{1,2}))\\.){4}");
	}

	public static void main(final String[] args) {

		/*
		 * Examine the function 'isValid'. What does it validate? At first sight it look
		 * like validate IP addresses directly, but the "\" char before "\d" indicates
		 * the regexp will look for a string with "\d" in it. So the 'isValid' function
		 * validate a regexp string which can be used to validate IP addresses.
		 * 
		 * Case 1: (([1]\\d\\d)\\.){4}
		 * Matches with: '1\d\d\.1\d\d\.1\d\d\.1\d\d\.' <- a new regexp
		 * Can used to validate: IP addressed from 100.100.100.100. to 199.199.199.199.
		 * 
		 * 
		 * Case 2: ((2[0-4]\\d)\\.){4} 
		 * Matches with: '20\d\.20\d\.20\d\.20\d\.' - '24\d\.24\d\.24\d\.24\d\.'
		 * Can be used to validate: IP addresses from 200.200.200.200. to 249.249.249.249.
		 * 
		 * Case 3: ((25[0-5])\\.){4}
		 * Matches with: '250\.250\.250\.250\.' - '255\.255\.255\.255\.'
		 * Can be used to validate: This is probably used to validate netmask above /29
		 * 
		 * Case 4: ((\\d{1,2})\\.){4}
		 * Matches with: Repetition of 2 digits followed by a .
		 * 
		 * For which cases the validation fails?
		 * 
		 * 
		 * 
		 */

		String input = args[0];
		String result = Test1.isValid(input) ? "valid" : "not valid";
		System.out.println("Input " + input + " is " + result);
	}

}
