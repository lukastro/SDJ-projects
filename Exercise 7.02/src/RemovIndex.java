import java.util.*;
public class RemovIndex
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] elements = new String[10];
      int index;
      
      for (int i=0; i < elements.length; i++) {
         elements[i] = input.nextLine();
      }
      
      for (int i=0; i < elements.length; i++) {
         System.out.println(elements[i]);
      }
      System.out.println(" ");
      System.out.println("index");
      index = input.nextInt();
      
      for (int i=index; i<elements.length-1; i++) {
         elements[i] = elements[i+1];
      }
      for (int i = 0; i < elements.length-1; i++)
      {
         System.out.println(elements[i]);
         input.close();
      }
   }
}
