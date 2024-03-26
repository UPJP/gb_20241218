	package Test;
	import java.util.Scanner;
	import java.util.InputMismatchException;
	
	import Extends.main01;
	
	
	public class Main01 extends main01{
		public static void main(String[] args) {
			Calc ca = new Calc("유명준");
			
			System.out.println(ca.getName());
			Scanner scan = new Scanner(System.in);	
			try {
				System.out.println("num1 입력값 : ");
	            while (!scan.hasNextInt()) {
	                System.out.println("정수를 입력해주세요: ");
	                scan.next(); // 잘못된 입력을 버림
	            }
			int num1 = scan.nextInt();
			
			System.out.println("num2 입력값 : ");
            while (!scan.hasNextInt()) {
                System.out.println("정수를 입력해주세요: ");
                scan.next(); // 잘못된 입력을 버림
            }
            
		int num2 = scan.nextInt();
			System.out.println(num1 + "+" + num2 + "= " + ca.plus(num1, num2) );
			System.out.println(num1 + "-" + num2 + "= " + ca.minus(num1, num2) );
			System.out.println(num1 + "*" + num2 + "= " + ca.times(num1, num2) );
			System.out.println(num1 + "/" + num2 + "= " + ca.divide(num1, num2) );
			System.out.println(num1 + "%" + num2 + "= " + ca.divi(num1, num2) );
			}catch (Exception e) {
				System.out.println("올바른 숫자를 입력하세요");
			}
				
		}
	}
