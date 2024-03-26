package boxing;

public class Navy extends Unit{
	public Navy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void attack() {
		super.attack();
		System.out.println(this.getName()+ ">> 지상 상륙");
		System.out.println(super.getName()+ ">> 어뢰 발사!!");
	}
	public void nucleus() {
		System.out.println(super.getName()+">> 핵 공격");
	}
}
