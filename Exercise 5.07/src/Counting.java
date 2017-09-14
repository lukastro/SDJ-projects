import java.util.Scanner;
public class Counting
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int count;
      count = input.nextInt();
      for (int i=1; i<=count; i++)
      {
         System.out.println(Math.pow(i,2));
      }
   }
}
