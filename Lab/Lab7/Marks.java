package StudentMain;
import StudentMain.Student;
import java.util.Scanner;

public class Marks extends Student
{
  Scanner sc = new Scanner(System.in);

  public void get_details()
  {
    System.out.print("Enter the Name : ");
    name = sc.next();
    System.out.print("Enter the Department : ");
    dept = sc.next();
    System.out.print("Enter the Roll Number : ");
    roll = sc.nextInt();
    System.out.print("Enter the Marks 1 : ");
    marks1 = sc.nextInt();
    System.out.print("Enter the Marks 2 : ");
    marks2 = sc.nextInt();
  }

  public void put_details()
  {
    System.out.println("\n\nStudent Details :\nName : "+name+"\nDepartment : "+dept+"\nRoll Number : "+roll+"\nMarks 1 : "+marks1+"\nMarks 2 : "+marks2);
  }

}
