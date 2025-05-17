import java.util.Scanner;
public class MagicalDays
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] scores = new int[n];
      
      for(int i =0; i<n; i++)
      {
        scores[i] = sc.nextInt();
      }

      int magicalDays = 0;
      
      for(int i=1; i<n-1; i++)
      {
        if(scores[i] > scores[i - 1] && scores[i] > scores[i + 1])
        {
          magicalDays++;
        
        }
      }
      System.out.println(magicalDays);
    }
}