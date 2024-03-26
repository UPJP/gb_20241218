package hiding;

public class main01 {
	public static void main(String[] args) {
		Member cc = new Member("자바학생",20);
		System.out.println("이름 : "+ cc.getName());
		System.out.println("나이 : "+cc.getAge());
		
		cc.setName("김자바");
		System.out.println(cc.getName());
	}
}
