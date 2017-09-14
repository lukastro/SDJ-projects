import java.util.*;
public class ArrayListTest
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<>();
      int element;
      char letter;
      String word;
      int max;
      System.out.println("input some integers / press c if u want to continue adding / press s if u want to stop");
       
      while ( true)
      {
         word = input.next();
         letter = word.charAt(0);
         if (letter != 's')
         {
            break;
         }
         element = input.nextInt();

         list.add(element);
         
        
      }
      max = list.get(0);
      for (int i=0; i<list.size(); i++)
         
      {
         if (list.get(i)>max)
         {
            max=list.get(i);
         }
         
      }
      for (int i=0; i<list.size(); i++)
         
      {
         if (list.get(i) == max)
         {
            System.out.println(i);
          
        }
        
      }
      

   }

}
