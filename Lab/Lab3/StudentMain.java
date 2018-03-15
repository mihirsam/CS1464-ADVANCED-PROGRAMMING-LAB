import java.util.Scanner;

class Student
{
  String name;
  int reg_no, roll_no;
  char sec;
  static int flag=0;
  Student()
  {
    flag++;
    System.out.println("Object["+flag+"] created !");
  }

  Student(String name1, int reg, int roll, char sec1)
  {
    name = name1;
    reg_no = reg;
    roll_no = roll;
    sec = sec1;
  }

  void display()
  {
    System.out.println("\nName : "+name);
    System.out.println("Reg Number : "+reg_no);
    System.out.println("Section : "+sec);
    System.out.println("Roll Number : "+roll_no);
  }
}

class StudentMain
{
  public static void main(String args[])
  {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("\nHow many input to take : ");
    num = sc.nextInt();

    Student ob[] = new Student[num];
    String name;
    int reg_no, roll_no, i;
    char sec;



    for(i=0;i<num;i++)
    {
      //Input
      System.out.print("\n\nEnter the Name : ");
      name = sc.next();
      System.out.print("\nEnter the Registration Number : ");
      reg_no = sc.nextInt();
      System.out.print("\nEnter the Section : ");
      sec = sc.next().charAt(0);
      System.out.print("\nEnter the Roll Number : ");
      roll_no = sc.nextInt();

      ob[i] = new Student(name,  reg_no, roll_no, sec);
    }

    System.out.println("\nStudent Details are shown below  : ");

    for(i=0;i<num;i++)
    {
      ob[i].display();
    }
  }
}
