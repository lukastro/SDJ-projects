import java.util.*;
public class LastDigit
{
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number, last;
      
      System.out.println("write 1 number");
      number = keyboard.nextInt();
      
      if (number < 0) {
         number = -number;
      }
     
      last = (number % 10);
      
      System.out.println(last);
   }
}
