package method;

public class main02 {
	public static void main(String [] args) {	
		print(5);
		print(10);
		print(15);
		
		/*에러문
		 * 
		 * print(true); 
		 * print(10,50);   
		 */		
	}
	
	public static void print(int num) {
		System.out.println(num);
	}
}
