import java.util.Scanner;
public class Payroll
{
   public static void main(String[] args) {
      String name;
      int hours;
      double payRate;
      double grossPay;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("What is your name ");
      name = keyboard.nextLine();
      
      System.out.println("How many hours did you work this week? ");
      hours = keyboard.nextInt();
      
      System.out.println("What is you hourly pay rate? ");
      payRate = keyboard.nextDouble();
      
      grossPay = hours * payRate;
      
      System.out.println("Hello "+ name);
      System.out.println("Your gross pay is $ " + grossPay);
      
   }

}