package assingmentsweek3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is" +  id);

	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student name is" +  name );
	}
	public void getStudentInfo(int id, String name, String email) {
		System.out.println("Student email is" +  email );
	}
	public void getStudentInfo(int id, String name, String email,long mobilenumber) {
		System.out.println("Student  mobno is" +  mobilenumber );
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(12);
		s.getStudentInfo(12, "DhivagarR");
		s.getStudentInfo(12, "Dhivagar R", "dhivagarr98@gmail.com");
		s.getStudentInfo(12, "Dhivagar R", "dhivagarr98@gmail.com", 9489344344l);
		
	
	}

}
