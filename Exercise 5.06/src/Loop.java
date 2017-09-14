import java.util.Scanner;
public class Loop
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int numbers;
      int sum = 0;
       while (true)
       {
          numbers = input.nextInt();
          if (numbers != -1)
          {
            sum++;
          }
          else System.out.println(sum);
       }
   }
}
