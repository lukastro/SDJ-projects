import java.util.*;

public class SumArrays
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] array1 = new int[4];
      int[] array2 = new int[4];

      for (int i = 0; i < array1.length; i++)
      {
         array1[i] = input.nextInt();
      }

      for (int i = 0; i < array2.length; i++)
      {
         array2[i] = input.nextInt();
      }

      int[] sumArray = new int[4];

      for (int i = 0; i < sumArray.length; i++)
      {
         sumArray[i] = array1[i] + array2[i];
         System.out.println(sumArray[i]);

      }

   }
}
