import java.util.*;
public class List
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] x = new int[10];
      int index=0, min;
      
      System.out.println("10 integers");
      for (int i = 0; i < x.length; i++)
      {
         x[i] = input.nextInt();
      }
      
      for (int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");
      }
      min = x[0];
      for (int i = 0; i < x.length; i++)
      {
         if (x[i] < min) {
            min = x[i];
         }
      }
      int j=0;
       while  (x[j] != min) {
          index++;
          j++;
       }
       
       x[index] = x[0];
       x[0] = min;
         
      
      System.out.println("index " + index + "value " + min);
      for (int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " "); 
      }
      
      
      
      
   }
   
}
