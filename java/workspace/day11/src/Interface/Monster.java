package Interface;

public class Monster implements Fight, Move {
	private String name;

	public Monster(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 걷고있습니다");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 빠르게 움직입니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 점프!");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 공격을 시전합니다.");
	}

	@Override
	public void shield() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 몸을 웅크립니다.");
	}
	
}
