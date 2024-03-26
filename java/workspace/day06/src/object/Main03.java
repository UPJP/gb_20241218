package object;

class HelloWorld{
	String message;
	
	void sayHello() {
		System.out.println(message);
	}
	void setEng() {
		message = "Hello java";
		
	}
	void setKor() {
		message = "안녕하세요. 자바";
	}
}

public class main03 {
	
	public static void main(String[] args) {
	
		HelloWorld hw = new HelloWorld();
		hw.setKor();
		hw.sayHello();
		
		System.out.println("==================");
		
		hw.setEng();
		hw.sayHello();
		
		System.out.println("==================");
		
		hw.setEng();
		hw.setKor();
		hw.setKor();
		hw.setKor();
		hw.setKor();
		hw.setEng();
		System.out.println(hw.message);
		
	}
}
