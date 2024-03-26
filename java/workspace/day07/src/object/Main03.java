package object;

class User{
	String name;
	int age;
	
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class main03 {
	public static void main(String[] args) {
		User u = new User("자바학생" , 20);
		System.out.println(u.name);
		System.out.println(u.age);
		
	}

}
