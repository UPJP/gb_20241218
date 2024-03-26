package object;

class Member{
	/*
	 * - 멤버변수는 지역변수와 구별하기 위하여 가급적 
	 * 	 this를 통하여 접근하다
	 * - 메서드에 접근할때 this 키워드를 사용하는 것이 필수적인
	 *   것은 아니다.
	 */
	String name;
	int age;
	
	String getName() { return this.name; }
	void setName(String name) {this.name = name;}
	int getAge() {return this.age;}
	void setAge(int age) {this.age = age;}
	
	void say() {
		System.out.println(getName());
		System.out.println(this.getAge());
	}
}

public class main01 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("자바학생");
		member.setAge(20);
//		System.out.println(member.getName());
//		System.out.println(member.getAge());
		member.say();
	}

}






