package Extends;

public class main01 {
	public static void main(String[] args) {

		Calcparent cc = new Calcparent();
		System.out.println(cc.plus(20, 10));
		
		Calcchild cd = new Calcchild();
		System.out.println(cd.times(20, 10));
		System.out.println(cd.plus(20, 10));
	}
}
