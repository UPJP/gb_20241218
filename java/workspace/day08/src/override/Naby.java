package override;

public class Naby extends Unit{
	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName()+ ">> 지상 상륙");
		System.out.println(super.getName()+ ">> 어뢰 발사!!");
	}
	public void nucleus() {
		System.out.println(super.getName()+">> 핵 공격");
	}
}
