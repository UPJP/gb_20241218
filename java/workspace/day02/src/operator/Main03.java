package operator;

public class main03 {
	public static void main(String[] args) {
		int plus_num =1;     
		plus_num = plus_num + 1; //2
		System.out.println(plus_num);
		plus_num += 1;  //3
		System.out.println(plus_num);
		plus_num ++ ;  //4 
		System.out.println(plus_num);
		++ plus_num;  //5
		System.out.println(plus_num);
		System.out.println("========");
		int minus_unm = 5;
		minus_unm = minus_unm -1;
		System.out.println(minus_unm );
		minus_unm -=  1; 
		System.out.println(minus_unm );
		minus_unm -- ;
		System.out.println(minus_unm );
		-- minus_unm ;
		System.out.println(minus_unm );
	}

}
