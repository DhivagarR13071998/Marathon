package classroomassignments;

public class ReverseString {
public static void main(String[] args) {

		String str ="Amazon";
		char[] cs = str.toCharArray();
for (int i = cs.length-1; i >=0; i--) {
	System.out.println(cs[i]);
}
}
}