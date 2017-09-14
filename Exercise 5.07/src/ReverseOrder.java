import java.util.Scanner;
public class ReverseOrder
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers;
      numbers = new int[10];
      for (int i=0; i<numbers.length; i++)
      {
         numbers[i] = input.nextInt();
      }
      for (int i=numbers.length-1; i>0; i--)
      {
         System.out.println(numbers[i]);  
      }
   }
}
