import java.util.*;
public class Tictac
{
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      char[][] tictac = new char[5][5];
      
      for (int i = 0; i < tictac.length; i++)
      {
         for (int j = 0; j < tictac.length; j++)
         {
            if( j!= 0 && j!=2 && j!=4) {
               tictac[i][j]='|';
            }
            if (i == 1 || i ==3) {
               tictac[i][j]='-';
            }
         }
      }
      tictac[0][0] = '0';
      tictac[2][2]= 'X';
      for (int i = 0; i < tictac.length; i++)
      {
         for (int j = 0; j < tictac.length; j++)
         {
            System.out.print(tictac[i][j]);
         }
         System.out.println("");
      }
      
   }
}
