package classroomassignments;

public class Smartphone extends Androidphone {
	public void takeVideo() {
		System.out.println("Video taken in smartphone");
	}
	public static void main(String[] args) {
		
		Smartphone s=new Smartphone();
		s.takeVideo();
		Androidphone a=new Androidphone();
		a.takeVideo();

	}

}
