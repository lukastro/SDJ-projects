import java.util.*;
public class Occurrences
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] numbers = new int[10];
      ArrayList<Integer> list = new ArrayList<>();
      for (int i=0; i<numbers.length; i++)
      {
         numbers[i] = input.nextInt();
         
      }
      for (int i=0; i<numbers.length; i++)
      {
         if (!list.contains(numbers[i]))
         {
            list.add(numbers[i]) ;
         }
        
      }
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      
   }
}
