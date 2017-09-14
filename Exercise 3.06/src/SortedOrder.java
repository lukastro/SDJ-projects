import java.util.Scanner;

public class SortedOrder
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int a,b,c;
      int max=0,mid=0,min=0;
      
      a = keyboard.nextInt();
      b = keyboard.nextInt();
      c = keyboard.nextInt();
      
      if (a > b && a > c && b>c)
      {
         max = a;
         mid = b;
         min = c;      
      }
      else if  (a > b && a > c && c>b)
      {
         max = a;
         mid = c;
         min = b;      
      } 
      else if  (b > a && b > c && a>c)
      {
         max = b;
         mid = a;
         min = c;      
      }
      else if  (b > a && b > c && c>a)
      {
         max = b;
         mid = c;
         min = a;      
      }
      else if  (c > b && c > a && a>b)
      {
         max = c;
         mid = a;
         min = b;      
      }
      else if  (c > b && c > a && b>a)
      {
         max = c;
         mid = b;
         min = a;      
      }
     System.out.println(max +" " + mid + " " +min);
      
   }
}
