import java.util.Scanner;

class Student
{
  int roll, marks1, marks2;
  String name, dept;
}

class Marks extends Student
{
  Scanner sc = new Scanner(System.in);

  void get_details()
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

  void put_details()
  {
    System.out.println("\n\nStudent Details :\nName : "+name+"\nDepartment : "+dept+"\nRoll Number : "+roll+"\nMarks 1 : "+marks1+"\nMarks 2 : "+marks2);
  }

}

interface Sports
{
  void get_sports_wt();
}

class Result extends Marks implements Sports
{
  int sport_wt;
  Scanner sc = new Scanner(System.in);

  public void get_sports_wt()
  {
    System.out.print("Enter the Sport Weight : ");
    sport_wt = sc.nextInt();
  }

  void total_marks()
  {
    int total;
    total = marks1 + marks2 + sport_wt;
    System.out.println("Total Marks : "+total);
  }
}

class StudentMain
{
  public static void main(String args[])
  {
    Result obj = new Result();

    obj.get_details();
    obj.get_sports_wt();
    obj.put_details();
    obj.total_marks();
  }
}
