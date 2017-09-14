import java.util.Scanner;

public class Age
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int age;
      
      age = keyboard.nextInt();
      
      if (age <= 0)
      {
         System.out.println( "Error in age value" );
      }
      else if (0 < age && age <= 12)
      {
         System.out.println( "You are a child" );
      }
      else if (12 < age && age <= 19)
      {
         System.out.println( "You are a teenager" );
      }
      else if (19 < age && age <= 65)
      {
         System.out.println("You are an adult");
      }
      else if (age > 65 )
      {
         System.out.println("You are a senior citizen");
      }
   }
}
