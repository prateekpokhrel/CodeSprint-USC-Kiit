// Day4_2: Zig-Zag Numeric Wave Chart
import java.util.Scanner;
public class ZigZagProblem
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      sc.close();

      int maxWidth = (n -1) * 4+1;
      if(n> 10)
      {
        System.out.println("Abhik's marathon journey intensifies! Let's see his detailed zig zag pattern");
      }
      int totalNumbers = 0;

      for(int day = 1; day <=n; day++)
      {
        StringBuilder row = new StringBuilder();

        if(day %2 ==1)
        {
          for(int i =1; i <=day; i++)
          {
            row.append(i);
            if(i != day) row.append("   ");
          }
        }
          else{
            for(int i =day; i >=1; i--)
            {
              row.append(i);
              if(i != 1) row.append("   ");
            } 
          }
          totalNumbers += day;

          int rowWidth = row.length();
          int padding = (maxWidth - rowWidth) / 2;
          for(int p =0;p < padding; p++)
          {
            System.out.print(" ");
          }
          System.out.println(row);
        }
        System.out.println("Total numbers printed:" +totalNumbers);
      }
    }