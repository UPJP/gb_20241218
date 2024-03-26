package override;

public class Army2 extends Unit2 {
	public Army2(String name) {
		super(name);
	}
	//override
	
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">> 지상공격");
	
	}
	public void tank() {
		System.out.println(super.getName()+">> 탱크공격");
	}
}
