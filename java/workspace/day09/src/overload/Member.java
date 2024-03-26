
package overload;

public class Member {
	private String job;
	private int age;
	
	public void setMember(int age) {
		this.age=age;
	}
	
	public void setMember(String job) {
		this.job= job;
	}
	public void setMember(String job, int age) {
		this.job = job;
		this.age = age;
	}
	
	public void setMember(int age, String job) {
		this.age = age;
		this.job = job;
	}
	
	
	
	@Override
	public String toString() {
		return "Member [job=" + job + ", age=" + age + "]";
	}
	
	//기본생성자
	// 생성자 int parma1, this.age 할당
	// 생성자 String parma1, this.job 할당
	// 생성자 String parma1, int param2, 
	// this.job, this.age 각각 할당
	// toString()
}
