package Abstract;

public class Main01 {
	public static void main(String[] args) {
		Army army = new Army("육군");
		Navy navy = new Navy("해군");
		AirForce ai = new AirForce("공군");
		
		army.move();
		army.move();
		army.attck();
		
		navy.attck();
		navy.move();
		navy.move();
		
		ai.attck();
		ai.move();
	}
}
