package Abstract;
// 추상클래스는 생성자, 맴버변수, 일반 메서드들을 포함할 수 있다.
// 즉 공통 기능과 가이드라인을 모두 정의하며 다른 클래스에게 상속된다.
public abstract class Hello {
	//맴버변수
	private String msg;
	
	//생성자 
	public Hello(String msg) {
		this.msg = msg;
	}
	//일반 메서드 
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	//추상메서드 : 선언만 되고, 구현부를 위한 블록이 존재하지 않는다.
	public abstract void sayHello();
	
}
