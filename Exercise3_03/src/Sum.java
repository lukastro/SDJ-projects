import java.util.Scanner;

public class Sum
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int num1,num2,num3,sum;
      
      System.out.println("num1 = ");
      num1 = keyboard.nextInt();

      System.out.println("num2 = ");
      num2 = keyboard.nextInt();
      
      System.out.println("num3 = ");
      num3 = keyboard.nextInt();
      
      sum = num1 + num2 + num3;
      System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum);
   }
}
