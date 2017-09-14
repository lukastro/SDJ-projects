import java.util.Scanner;

public class MyNameAndAge
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.print("What is your name? ");
      String name = keyboard.nextLine();
      
      System.out.print("What is your age? ");
      int age = keyboard.nextInt();
      
      System.out.print("Your name is " + name + " and your age is " + age);
   }

}
