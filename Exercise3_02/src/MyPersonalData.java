import java.util.Scanner;

public class MyPersonalData
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name,address;
      int age;
      
      System.out.println("name?");
      name = keyboard.nextLine();
       
      System.out.println("age? ");
      age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.println("address?");
      address = keyboard.nextLine();
      
      System.out.println(name + age + address);
   }
}
