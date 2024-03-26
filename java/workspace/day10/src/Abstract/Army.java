package Abstract;

public class Army extends Unit {

	public Army(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attck() {
		System.out.println(super.getName() + ">>육상 공격 ");
	}

	public void move() {
		System.out.println(super.getName() + ">>육상이동");
	}

}
