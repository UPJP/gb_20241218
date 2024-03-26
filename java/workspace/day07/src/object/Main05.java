package object;

class User2{
	String name ="자바학생";
	int age = 20;
}
public class main05 {

	public static void main(String[] args) {
		User2 u  = new User2();
		// public 이므로 접근가능
		System.out.println(u.name);
		

	}

}
