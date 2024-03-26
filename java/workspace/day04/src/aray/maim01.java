package aray;

public class maim01 {	
	public static void main(String[] args) {
		/*
		 *  배열의 생성
		 */
		// 배열의 선언과 크기 지형 및 값의 할당에 대한 개발 처리
		int[] dooly;
		dooly = new int[3];
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		// 배열의 선언과 크기 지정을 일괄처리
		
		int[] douneo = new int [3];
		douneo[0] = 88;
		douneo[1] = 64;
		douneo[2] = 50;
		
		// 배열의 생성의 일괄처리
		int[] ddocy = new int [] {100,100,90};
		
		/*
		 * 배열의 활용
		 */
		int sum1 = 0, sum2 =0, sum3 = 0;
		// sum1 : 둘리의 총합    출력 248  , 평균 82
		// sum2 : 도우너의 총합    202      67
		// sum3 : 또치의 총합     290       96  
		
		
		for (int i =0 ; i < dooly.length; i++) {
			sum2 += douneo[i] ;
			sum1 += dooly[i];
			sum3 += ddocy[i];
		}
		System.out.println("둘리의 총합: " + sum1 +" 평균: "+(sum1/dooly.length));
		System.out.println("도우너의 총합 :" + sum2 +" 평균: "+(sum2/3));
		System.out.println("또치의 총합 :" + sum3 +" 평균: "+(sum3/3));
		
	}

}
