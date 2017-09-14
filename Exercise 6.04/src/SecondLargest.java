import java.util.*;

public class SecondLargest
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers;
      numbers = new int[5];
      int max = 0, secondMax = 0;

      for (int i = 0; i < numbers.length; i++)
      {
         numbers[i] = input.nextInt();
      }
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] > max)
         {
            max = numbers[i];
         }
      }
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] > secondMax && numbers[i] < max)
         {
            secondMax = numbers[i];
         }
      }
      System.out.println(secondMax);
   }

}
