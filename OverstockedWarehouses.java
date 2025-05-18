import java.util.Scanner;
public class OverstockedWarehouses
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);

   int r = sc.nextInt();
   int c = sc.nextInt();

   int[][] stock = new int[r][c];
   for (int i=0; i <r; i++)
   {
     for(int j=0; j<c; j++)
     {
       stock[i][j] = sc.nextInt();
     }
   }
   int overstockedCount = 0;

   for(int i = 0; i<r; i++)
   {
     int count =0;
     for(int j=0; j < c; j++){
       if(stock[i][j] >= 100){
         count++;
       }
     }
     if(count >= 3)
     {
       overstockedCount++;
     }
   }
   System.out.println(overstockedCount);
 }
}