import java.util.Scanner;
public class LongestIncreasingSubarray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] temps = new int[n];

    for(int i=0; i<n; i++)
    {
      temps[i] = sc.nextInt();
    }
    int maxLen = 1;
    int currLen =1;

    for(int i=1; i<n; i++)
    {
      if(temps[i] > temps[i-1])
      {
        currLen++;
        maxLen = Math.max(maxLen, currLen);
      }
      else{
        currLen =1;
      }
    }
    System.out.println(maxLen);
  }
}