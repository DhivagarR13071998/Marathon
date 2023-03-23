package assingmentsweek3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value ="rotator";
		String revvalue ="";
		char[] cs = value.toCharArray();
		for (int i = cs.length-1; i >=0; i--) {
			revvalue= revvalue + cs[i];
		}
			if (value.equals(revvalue)) {
				System.out.println("The given word "+ revvalue+" is Palindrome");
			}
			else {
			System.out.println("this is not a palindorme");
			}
		}
		
	

	}

