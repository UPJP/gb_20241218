package method;

public class main02 {

   public static void main(String[] args) {
      int[] numbers = { 3, 7, 1, 9, 4 };
      int max = findMax(numbers);
      System.out.println("최대값: " + max);
   }

   public static int findMax(int[] numbers) {
      
      int and = numbers[0];
      
      for(int i=1; i<numbers.length; i++) {
         if(and<numbers[i]) {
            and= numbers[i];
         }
      }
      return and;
      
   }

}