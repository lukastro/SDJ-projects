
public class Golf
{
   public static void main(String[] args) {
      int[] values = {3, 5, 1, 3, 3, 2, 4, 1, 3};
      int sum=0,sumOnes=0;
      double avrg;
      
      
      for (int i=0; i<values.length; i++) {
         sum += values[i];
         if (values[i] == 1) {
            sumOnes++;  
         }
      }
      avrg = (double) sum / values.length;
      System.out.println("number of hits = " + sum);
      System.out.println("avarage = " + avrg );
      System.out.println("number of Hole-in-Ones's = " + sumOnes);
   }
}
