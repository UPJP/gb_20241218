package override;

class Hello2{
	public void say() {
		System.out.println("hello!!!");
	}
}
class Korea2 extends Hello2{
	// Korea2 클래스가 say() 메서드를 오버라이드 처리하면서
	// Korea2 클래스의 객체는 더 이상 부모의 say()메서드를 접근불가
	public void say() { 
	 // 부모의 메서드의 코드를 자식 메서드에게 동일하게 적용
	 // 원본 기능에 대한 수정이 발생한 경우 부모 클래스와 자식 클래스를
	 // 모두 수정해야 하기 떄문에 소스코드의 유지보수 효율성이 떨어진다
		System.out.println("hello");
		
	// super 키워드는 부모 클래스의 메서드를 호출하는 기능을 가지고 있기
	// 떄문에 오버라이드된 자식 클래스의 메서드에서 super키워드를
	// 사용하면, 재정의 되기 이전의 부모 클래스에 대한 메서드를 호출할수 있다.
	// super 키워드를 사용하며 부모의 메서드를 호출한뒤 추가적인
	// 기능을 정의하고 있으므로, 부모의 원본 메서드에 대한 기능 확장 효과가있다.
		super.say();
		System.out.println("안녕하세요");	
	}
}

public class main02 {
	public static void main(String[] args) {
		Korea2 k = new Korea2();
		k.say();
		
	}
}
