import java.util.Scanner;

public class PayrollWithTax
{

   public static void main(String[] args)
   {
      String name;
      int age;
      double payRate;
      double hours;
      double taxRate;
      double payRoll;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.println("How many hours did you work this week?");
      hours = keyboard.nextDouble();
      
      System.out.println("What is you hourly pay rate?");
      payRate= keyboard.nextDouble();
      
      System.out.println("What is your tax rate? ");
      taxRate= keyboard.nextDouble();
      
      payRoll = hours * payRate / 100 * (100 - taxRate);  
      
      System.out.println("Hello " + name + ". Your payroll is " + payRoll );
   }

}