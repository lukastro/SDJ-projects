import java.util.Scanner;
public class Date
{
   
   public static void main(String[] args)
   {     
      Scanner keyboard = new Scanner(System.in);
      System.out.println("day, month and year");
      int day = keyboard.nextInt();
      int month = keyboard.nextInt();
      int year = keyboard.nextInt();
      
      if (month == 2)
      {
         if (day > 28)
         {
            System.out.println("illegal date");
         }
         else
         {
            System.out.println(day + "/" + month + "/" + year);
         }
      }
      if (month == 4 || month == 6 || month == 9 || month == 11)
      {
         if (day > 30)
         {
            System.out.println("illegal date");  
         }
         else
         {
            System.out.println(day + "/" + month + "/" + year);  
         }
      }
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
      {
         if (day > 31)
         {
            System.out.println("illegal date");  
         }
         else
         {
            System.out.println(day + "/" + month + "/" + year);
         }
      }
      if (month > 12)
      {
         System.out.println("illegal date");
      }
   }
}
