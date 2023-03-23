package classroomassignments;

public class Samsung extends AndroidTv{

	@Override
	public void Watchvideo() {
		System.out.println("video is watched");
		
	}

	@Override
	public void shutDown() {
		System.out.println("shutdowned");
		
	}
public static void main(String[] args) {
	Samsung n=new Samsung();
	n.OpenanApp();
	n.shutDown();
	n.Watchvideo();
	
}
	

}
