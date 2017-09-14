import java.util.Scanner;
public class PrintSum
{ 
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int count = 5;
      int sum = 0;
      double avrg;
      
      for (int i=0; i<count; i++)
      {
         System.out.println("type an integer");
         int value = keyboard.nextInt();
         sum += value;
      }
      System.out.println("sum is = " + sum);
      avrg = sum / count;
      System.out.println(avrg);
   }
}
