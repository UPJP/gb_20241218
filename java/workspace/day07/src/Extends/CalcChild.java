package Extends;

//Calcparent를 상속받는 클래스
public class Calcchild extends Calcparent{
	public int times(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		int result = 0;
		if (y != 0) {
			return x / y;
		}
		return result;
	}
}
