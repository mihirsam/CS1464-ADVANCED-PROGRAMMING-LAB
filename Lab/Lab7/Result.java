package StudentResult;
import StudentMain.Marks;
import StudentMain.Sports;
import java.util.Scanner;

public class Result extends Marks implements Sports
{
  public int sport_wt;
  Scanner sc = new Scanner(System.in);

  public void get_sports_wt()
  {
    System.out.print("Enter the Sport Weight : ");
    sport_wt = sc.nextInt();
  }

  public void total_marks()
  {
    int total;
    total = marks1 + marks2 + sport_wt;
    System.out.println("Sport Weight : "+sport_wt+"\nTotal Marks : "+total);
  }
}
