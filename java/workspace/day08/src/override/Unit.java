package override;

public class Unit {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void attack() {
		System.out.println(this.name + ">> 공격준비");
	}

	public static void main(String[] args) {
	}
	
}
