package boxing;

public class Army extends Unit {
	public Army(String name) {
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
