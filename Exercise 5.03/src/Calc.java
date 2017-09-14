import java.util.Scanner;
public class Calc
{
   public static void main(String[] args)
   {
      int sum = 0;
      Scanner input = new Scanner(System.in);  
      for (int i=0; i<6; i++)
      {
         String word = input.nextLine();
         
         sum += word.length();
      }  
      System.out.println(sum);
   }
}
