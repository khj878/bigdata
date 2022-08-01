public class User {
	public static void main(String[] args) {
		RemoteCon rc = null;
		
		rc = new TVRemoteCon();
		rc.turnOn();
		rc.turnOff();
		rc = new RadioRemoteCon();
		rc.turnOn();
		rc.turnOff();
	}
}
