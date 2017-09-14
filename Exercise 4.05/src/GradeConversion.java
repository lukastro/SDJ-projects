import java.util.Scanner;
public class GradeConversion
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String letter;
      System.out.println(" 7-scale grade");
      int grade = keyboard.nextInt();
      
      switch (grade)
      {
         case 12 : letter = "A" ; System.out.println(" international scale -" + letter);break;
         case 10 : letter = "B" ; System.out.println(" international scale -" + letter);break;
         case 7 : letter = "C" ; System.out.println(" international scale -" + letter);break;
         case 4 : letter = "D" ; System.out.println(" international scale -" + letter);break;
         case 2 : letter = "E" ; System.out.println(" international scale -" + letter);break;
         case 0 : letter = "Fx" ; System.out.println(" international scale -" + letter);break;
         case -3 : letter = "F" ; System.out.println(" international scale -" + letter);break;
         default : System.out.println("Invalid grade");
      }
   }
}
