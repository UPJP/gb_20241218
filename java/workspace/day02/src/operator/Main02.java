package operator;

public class main02 {
	public static void main(String[] args) {
		int source = 100;
		
		source += 100; // x + 100 ; 200 
		System.out.println(source);
		source -= 50;  // x - 50  ; 150
		System.out.println(source);
		source *= 2;   // x * 2   ; 300
		System.out.println(source);
		source /= 100; // x / 100 ; 3
		System.out.println(source);
		source %= 2;   // x & 2   ; 1
		System.out.println(source);
	}
}
