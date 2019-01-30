package welcom;

public class TestDriveWaySize {

	public static void main(String[] args) {
		Driveway jhon = new Driveway();
		
		jhon.setDriveWaySize(8);
		System.out.println("jhon's drive way size: " + jhon.getDriveWaySize());
		Driveway arif = new Driveway();
		arif.setDriveWaySize(4);
		System.out.println("arif's drive way size: " + arif.getDriveWaySize());
		
	}

}
