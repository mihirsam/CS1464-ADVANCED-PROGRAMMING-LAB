import java.util.Scanner;

class Inst
{
  int num1, num2;

  void input()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the num1 : ");
    num1 = sc.nextInt();
    System.out.println("Enter the num2 : ");
    num2 = sc.nextInt();

  }

  void  display()
  {
    System.out.println("Num1 = "+num1+" and Num2 = "+num2);
  }
}

class InstMain
{
  public static void main(String args[])
  {
    Inst ob1 = new Inst();

    ob1.input();
    ob1.display();
  }
}
