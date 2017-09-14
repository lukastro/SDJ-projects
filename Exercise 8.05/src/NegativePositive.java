   import java.util.*;
public class NegativePositive
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<Integer> positive = new ArrayList<>();
      ArrayList<Integer> negative = new ArrayList<>();
      int numbers, pos = 0, neg = 0, max = -1000000, min = 1000000;
      
      System.out.println("Input integers when you want to stop hit 0");
      
      while(true)
      {
         
         numbers = keyboard.nextInt();
         if(numbers == 0)
         {
            break;
         }
         if(numbers < 0)
         {
            negative.add(numbers);
            neg++;
            if(numbers < min)
               min = numbers;
         }
         else 
         {
            positive.add(numbers);
            pos++;
            if(numbers > max)
               max = numbers;
         }
      }
      System.out.println(pos + " positive " + neg + " negative " + max + " biggest " + min + " smallest");
   }
}