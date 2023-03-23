package classroomassignments;

public class Wordcount {

	public static void main(String[] args) {
		String str="TestLeaf";
		char e='e';
		int count=0;
		char[] ch = str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]==e) {
			count++;
			
		}}
		if(count>1) {
			System.out.println("The letter"+ e +"appearing is"+ count + "times");
			
		}
	}

	}


