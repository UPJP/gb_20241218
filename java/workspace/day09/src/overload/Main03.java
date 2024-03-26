package overload;

public class Main03 {
	public static void main(String[] args) {

		//각각의 생성자 형태로 각각의 객체 생성
		// 총 4개의 서로다른 생성자로 객체 생성
		// 각각 toString()  출력
		
		Member m1 =new Member();
		
		System.out.println(m1.toString());
		
		m1.setMember("검사");
		System.out.println(m1.toString());
		m1.setMember(20);
		System.out.println(m1.toString());
		m1.setMember(30, "판사");
		System.out.println(m1.toString());
		m1.setMember("사망", 60);
		System.out.println(m1.toString());
		
	}
}
