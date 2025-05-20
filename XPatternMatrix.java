//Day4_1: X-Pattern Matrix
import java.util.Scanner;
public class XPatternMatrix
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []  mainDiag = new int[n];
    int [] antiDiag = new int[n];
  

  for(int i=0; i <n; i++)
  {
    mainDiag[i] = i + 1;
    antiDiag[i] = n - i;
  }
    for(int i =0;i<n;i++)
    {
    StringBuilder row = new StringBuilder();
    for (int j =0; j<n; j++)
    {
      if(i==j && i + j == n-1)
      {
        row.append(mainDiag[i]);
      }
      else if(i==j){
        row.append(mainDiag[i]);
      }
      else if(i+j == n - 1)
      {
        row.append(antiDiag[i]);
      }
      else{
        row.append("-");
      }
    if(j != n - 1) row.append(" ");
  }
  System.out.println(row);
}
}
}
