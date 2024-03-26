package object;

class Calc{
	int plus(int num1, int num2) {
        return num1 + num2;
    }

    int minus(int num1, int num2) {
        return num1 - num2;
    }

    int times(int num1, int num2) {
        return num1 * num2;
    }

    int divide(int num1, int num2) {
        int result = 0;
        if (num2 != 0) {
        	result = num1 / num2;
        }
    	return result;
    }

}

public class main04 {
	public static void main(String[] args) {
//		Calc 클래스 생성
//		-4개의 메서드 정의
//		-plus (int,int) return int
//		-minus (int,int)return int
//		-times (int,int)return int
//		-divide (int,int)return int
//		-결과값 각각 출력
		
		Calc cc =  new Calc();
		
		int num1=10;
		int num2=0;
		
		
		System.out.println("num1 + num2 :"+cc.plus(num1 , num2));
		System.out.println("num1 - num2 :"+cc.minus(num1 , num2));
		System.out.println("num1 * num2 :"+cc.times(num1 , num2));
		System.out.println("num1 / num2 :"+cc.divide(num1 , num2));
		
		
	}
}
