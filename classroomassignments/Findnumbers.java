package classroomassignments;

public class Findnumbers {

	public static void main(String[] args) {
		String input="chennai 600028";
		String word = input.replaceAll("[^a-z]", "");
		System.out.println(word);
		String num = input.replaceAll("[^0-9]", "");
		System.out.println(num);
	}

}
