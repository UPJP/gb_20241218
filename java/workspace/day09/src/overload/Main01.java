package overload;

class Character{
	private String job;
	private int age;
	
	public void setProperty(String job) {
		this.job = job;
	}
	public void setProperty(int age) {
		this.age = age;
	}
	public void setProperty(String job,int age) {
		this.job =job;
		this.age = age;
	}
	public void setProperty(int age, String job) {
		this.age = age;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Chararcter [job=" + job 
				+ ", age=" + age + "]";
	}
}
public class Main01 {
	public static void main(String[] args) {
		
		Character c = new Character();
		System.out.println(c.toString());
		
		c.setProperty(19);
		System.out.println(c.toString());
		
		c.setProperty("회사원");
		System.out.println(c.toString());
		
		c.setProperty(20,"자영업");
		System.out.println(c.toString());
		
		c.setProperty("교수", 30);
		System.out.println(c.toString());
	}
}
