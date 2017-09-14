
public class ReversedOrder
{
   public static void main(String[] args) {
      int[] list = new int[]{1,2,3,4};
      int index=0;
      
      for (int i = 0; i < list.length; i++)
      {
         System.out.println("array[" + i + "] = " + list[i]);
      }
      System.out.println("After reversing:");
      
      for (int i=list.length-1; i>=0; i--) {
         
         System.out.println("array[" + index + "] = " +list[i]);
         index++;
      }
   }
}
