import java.util.*;
public class List
{
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      System.out.println("write 7 integers");
      int index=0;
      for (int i = 0; i < 7; i++)
      {
         list.add(input.nextInt());
      }
      
      for (int i=1; i < list.size(); i++) {
         if (list.get(i) > list.get(index)) {
            index=i;
         }
      }
      System.out.println("index = " + index + "element = " + list.get(index));
      
   }
}
