import java.util.Scanner;
import java.util.ArrayList;
public class Inception
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();
      int index;
      String element;
      
      for (int i = 0; i < 7; i++)
      {
         list.add(input.nextLine()) ;
      }
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i)); 
      }
      System.out.println("give me index and string");
      index = input.nextInt();
      element = input.next();
      
      list.add(index,element);
      for (int i = 0; i < 8; i++)
      {
         System.out.println(list.get(i));
      }
   }
}  