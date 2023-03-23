package assingmentsweek3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		for (int i = 1; i < ch.length; i++) {
			if (i%2!=0) {//i(0)=c i(1)=h i(2)=a i(3)=n i(4)=g i(5)=e i(6)=m i(7)=e 
				ch[i] = Character.toUpperCase(ch[i]);
			}
			System.out.println(ch[i]);
		}

	}

}
