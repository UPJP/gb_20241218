package boxing;

public class AirForce extends Unit {
	public AirForce(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		super.attack();
		System.out.println(getName()+">> 이륙");
		System.out.println(getName()+">> 미사일 공격 실행");
	}
	
	public void bombing() {
		System.out.println(getName()+">> 지원 폭격");
	}
}
