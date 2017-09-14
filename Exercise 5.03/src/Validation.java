import java.util.Scanner;
public class Validation
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int value;
      do
      {
         System.out.println("Type a  value in the range [10;25]");
         value = input.nextInt();
         if (value < 10 || value > 25)
         {
            System.out.println("wrong value");
         }
      }
      while (value < 10 || value > 25);
      System.out.println(value);  
   }
}
