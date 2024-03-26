package override;

public class mian04 {
	public static void main(String[] args) {
		Army a =new Army();
		a.setName("육군");
		a.attack();
		a.tank();
		
		System.out.println("======================");
		Naby n =new Naby();
		n.setName("해군");
		n.attack();
		n.nucleus();
		
		System.out.println("======================");
		AirForce ar =new AirForce();
		ar.setName("공군");
		ar.attack();
		ar.bombing();
	}
}
