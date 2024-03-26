package override;

public class mian05 {
	public static void main(String[] args) {
		Army2 am = new Army2("육군");
		am.attack();
		am.tank();
		
		Naby2 na = new Naby2("해군");
		na.attack();
		na.nucleus();
		AirForce2 air =new AirForce2("공군");
		
		air.attack();
		air.bombing();
		
	}
}
