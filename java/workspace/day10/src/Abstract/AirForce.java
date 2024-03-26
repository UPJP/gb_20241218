package Abstract;

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attck() {
		System.out.println(this.getName()+">>공중공격");
	}
	public void move() {
		System.out.println(super.getName()+">>공중이동");
	}

}
