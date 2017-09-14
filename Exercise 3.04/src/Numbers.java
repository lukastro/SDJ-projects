import java.util.Scanner;

public class Numbers
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int num1,num2;
      double div,mod;
      
      System.out.println("first number");
      num1 = keyboard.nextInt();
      
      System.out.println("second number");
      num2 = keyboard.nextInt();
      
      if (num1 < num2)
      {
         System.out.println(num1 + " " + num2);
      }
      else
         {
         System.out.println(num2 + " " + num1);
         }
      
      System.out.println("sum = " + (num1 + num2));
      
      if (num2 != 0)
      {
         div = num1 / num2;
         System.out.println(div);        
      }
      else 
         {
         System.out.println("cannot divide by 0 ");
         }
      if (num2 != 0)
      {
         mod = num1 % num2;
         System.out.println(mod);
      }
      else 
      {
         System.out.println("cannot divide by 0");
      }
   }
}
