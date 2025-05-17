import java.util.Scanner;
public class ArcheryScore{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n= sc.nextInt();
    int goodShots = 0;
    int missedShots=0;

    for(int i=0; i < n;i++)
    {
      int score = sc.nextInt();
      if(score >=7)
      {
        goodShots++;
      }
      else{
        missedShots++;
      }
    }  
  System.out.println(goodShots +" "+missedShots);

    sc.close();
  }
  
}