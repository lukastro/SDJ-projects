import java.util.*;
public class Test
{
   public static void main(String[] atgs) {
      Scanner keyboard = new Scanner(System.in);
      int[] x = new int[6];
      int index=0, min=x[0];
      
      for (int i = 0; i < x.length; i++)
      {
         x[i] = keyboard.nextInt();
      }
      for (int i = 0; i < x.length; i++)
      {
         System.out.print(x[i]);
      }
      
      for (int i = 0; i < x.length; i++)
      {
         if (x[i] < min) {
            min = x[i];
         }
      }
      
   }
}
