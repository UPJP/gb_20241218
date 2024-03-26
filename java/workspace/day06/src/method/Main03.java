package method;

public class main03 {

   public static void main(String[] args) {
      int width = 5;
      int height = 8;
      int area = calculateArea(width, height);
      System.out.println("사각형의 넓이: " + area);
   }
   
   public static int calculateArea(int width, int height ){
      int sum = width * height;
      return sum;
   }

}