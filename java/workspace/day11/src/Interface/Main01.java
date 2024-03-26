package Interface;

public class Main01 {
	public static void main(String[] args) {
		Charcter c = new Charcter("주인공");
		
		c.walk();
		c.shield();
		c.jump();
		c.attack();
		c.pickup();
		c.run();
		System.out.println("=================");
		Monster m = new Monster("악당");
		m.walk();
		m.shield();
		m.jump();
		m.attack();
		m.run();

	}
}
