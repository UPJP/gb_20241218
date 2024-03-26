package object;

class Character{
	//맴버변수 선언
	String name;
	int age; 
	String job;
	
}
public class main02 {
	
	public static void main(String[] args) {
	// character 클래스를 가지고 객체2개 생성 후,
    // 각 객체별  name,age,job을 할당 후 출력
	
		Character std1 = new Character();
		Character std2 = new Character();
		Character std3 = new Character();
		
		std1.name = "이순신";
		std1.age  =  30;
		std1.job  = "장군";
		
		std2.name = "리 븐";
		std2.age  =  27;
		std2.job  = "사기";
		
		std3.name = "카 밀";
		std3.age  =  47;
		std3.job  = "검사";
		
		
		System.out.println("이름 : "+std1.name);
		System.out.println("나이 : "+std1.age);
		System.out.println("직업 : "+std1.job+"\n");
		
		System.out.println("이름 : "+std2.name);
		System.out.println("나이 : "+std2.age);
		System.out.println("직업 : "+std2.job+"\n");
		
		System.out.println("이름 : "+std3.name);
		System.out.println("나이 : "+std3.age);
		System.out.println("직업 : "+std3.job);
	}
}
