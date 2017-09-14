import java.util.Scanner;
import java.util.ArrayList;
public class Qwe
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>(7);
      
      for (int i = 0; i < list.size(); i++)
      {
         list.add(input.nextLine()) ;
      }
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i)); 
      }
      
   }
}  