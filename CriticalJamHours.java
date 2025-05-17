import java.util.Scanner;
public class CriticalJamHours
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int[] vehicles = new int[n];

    for(int i =0; i<n; i++)
    {
      vehicles[i] = sc.nextInt();
    }
    int count =0;
    for(int i =1; i<n; i++)
    {
      if(vehicles[i] >=50 && vehicles[i] > vehicles[i-1])
      {
        count++;
      }
    }
    System.out.println(count);
  }
}