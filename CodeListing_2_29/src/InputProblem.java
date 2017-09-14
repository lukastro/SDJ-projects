import java.util.Scanner;

public class InputProblem
{

   public static void main(String[] args)
   {
      String name;
      int age;
      double income;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is your age? ");
      age = keyboard.nextInt();
      
      System.out.println("What is your annual income? ");
      income = keyboard.nextDouble();
      
      System.out.println("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.println("Hello " + name + ". Your age is " + age + " and your income is $" + income);
   }

}
