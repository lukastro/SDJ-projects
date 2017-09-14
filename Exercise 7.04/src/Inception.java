import java.util.*;
public class Inception
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String[] words = new String[8];
      int index;
      String element;
      
     for (int i=0; i<words.length-1; i++)
     {
        words[i] = input.nextLine();
     }
     
     System.out.println("insert  index and a string");
    
     index = input.nextInt();
     element = input.next();
     
     for (int i=index; i<words.length; i++)
     {
        words[i] = words[i-1];
     }
     words[index] = element;
    
     for (int i=0; i<words.length; i++)
     System.out.println(words[i]);
   }
}
