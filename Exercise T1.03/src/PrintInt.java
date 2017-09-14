import java.util.*;
public class PrintInt
{
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int[] numbers = new int[5];
      int smalPos= 10000000;
      int count=0;
      
      System.out.println("write 5 integers");
      
      for (int i = 0; i < numbers.length; i++)
      {
         numbers[i] = keyboard.nextInt();
      }
    
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] > 1) {
            
            if (smalPos > numbers[i]) {
               smalPos = numbers[i];
            }
         }
      }
      for (int i = 0; i < numbers.length; i++)
      {
         if(numbers[i]>0 && numbers[i] < 100) {
            count++;
         }
      }
   
      
      System.out.println(smalPos);
      System.out.println(count);
   }
}
