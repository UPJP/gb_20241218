package Interface;

public class Charcter implements Action, Fight ,Move{
	public Charcter(String name) {
		super();
		this.name = name;
	}

	private String name;

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 걷습니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 뛰고 있습니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 점프!");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 공격합니다.");
	}

	@Override
	public void shield() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 방어합니다.");
	}

	@Override
	public void pickup() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ">> 줍습니다.");
		
	}
	

	//walk() - > this.name + ">> 걷습니다"
}
