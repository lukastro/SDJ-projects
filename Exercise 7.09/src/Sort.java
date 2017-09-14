import java.util.Scanner;
public class Sort
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] x = new int[5];
      int index=0, min, help;
      
      System.out.println("5 integers");
      for (int i = 0; i < x.length; i++)
      {
         x[i] = input.nextInt();
      }
      
      for (int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");
      }
      
      System.out.println(" ");
      
      for (int i=0; i < x.length-1; i++){
         min = i;
         for (int j=i+1; j < x.length; j++) {
            if (x[j] < x[min]) {
               min=j;
            }
         }
               help = x[i];
               x[i] = x[min];
               x[min] = help;
               
         
      }
      for (int i = 0; i < x.length; i++)
      {
         System.out.print(x[i] + " ");
      
     

   
   }
   }
}
