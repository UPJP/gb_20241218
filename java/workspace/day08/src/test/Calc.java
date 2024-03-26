package Test;

public class Calc {
	private String name;

	public Calc(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int plus(int num1 ,int num2) {
		return num1 + num2;
	}
	public int minus(int num1 ,int num2) {
		return num1 - num2;
	}
	public int times(int num1 ,int num2) {
		return num1 * num2;
	}
	public int divide(int num1 ,int num2) {
		int result = 0;
		if(num2 != 0){
			return num1 / num2;
		}return result;
	}
	public int divi(int num1 ,int num2) {
		int result = 0;
		if(num2 != 0){
			return num1 % num2;
		}return result;
	}
}
