package Interface;

/*
 *  - 인터페이스 상속은 implements 키워드를 사용한다.
 *  - 인터페이스도 추상화를 구현하고 있기 때문에,
 *  인터페이스를 상속받는 클래스는 인터페이스내의 모든 메서드들을
 *  반드시 재정의 해야 한다.
 *  - 인터페이스 다중상속은 콤마(,)로 연결해서 여러개를 동시에 상속받을수 있다.
 */
public class User implements Unit{

	@Override
	public void attack() {
		
	}
	@Override
	public void shiled() {
		
	}
}
