package calendar;

import java.util.Calendar;

public class Main05 {

	public static void main(String[] args) {
		// 현재 1월달 달력 만드세요
		Calendar cal = Calendar.getInstance();
		
		// 이번 달은 몇 주로 되어 있는지?
		int week_count 
		= cal.getActualMaximum(Calendar.WEEK_OF_MONTH); 
		
		// 이번달은 몇일까지 있는가?
		int day_count 
		= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// 이반달은 무슨 요일부터 시작하는가?
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int first_day = cal.get(Calendar.DAY_OF_WEEK); 
		
		// 이번달은 몇 주인가? 	-> 행
		// 일~토 요일 			-> 열
		int[][] data = new int[week_count][7];
		// 출력할 날짜값 -> 이 값이 1씩 증가한다.
		int count = 1;
		
		// 주 수만큼 반복
		for( int i=0; i<data.length; i++ ) {
			// 일~토요일까지 반복
			for( int j=0; j<data[i].length; j++ ) {
				if( i==0 && j<first_day-1 ) {
					// i가 0	-> 첫 번째 주
					// j의 값은 요일에 대한 체크
					// 	-> 이번달 첫 주에서 1일이 시작되는 요일 전까지 
					data[i][j] = 0;
				} else if( count > day_count ) {
					// 이번 달의 마지막 날을 초과하는 경우
					data[i][j] = 0;
				} else {
					// 그 외의 경우에는 날짜값 넣어주기
					data[i][j] = count++;
				}
			}
		}
		
		// 배열 출력을 위한 반복문
		for( int i=0; i<data.length; i++ ) {
			for(int j=0; j<data[i].length; j++) {
				if( data[i][j] == 0 ) {
					System.out.print("\t");
				} else {
					System.out.printf("%2d\t", data[i][j]);
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

















