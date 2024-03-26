package method;

public class main04 {

   public static void main(String[] args) {
      System.out.println("계산 결과: " + calculate(5, 2, '+'));
   }

   public static int calculate(int num1, int num2, char giho) {
      int sum =num1 + num2 ;
      
      if (giho == '+') 
      return  num1+num2;
      return 0;
   }

}

//// 센세 방법
//public static double calculate(double num1, 
//								double num2, char op) {
//	
//	if (op == '+' || op == '-' || op == '*' || op == '/');
//	
//	double result = 0.0;
//	switch(op) {
//		case '+' : result =num1 + num2;
//					break;
//		case '-' : result =num1 - num2;
//		break;
//		case '*' : result =num1 * num2;
//		break;
//		case '/' : if(num2 != 0) {
//			result = num1 / num2;
//		}else {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		break;
//	}
//	
//	return result;
//}