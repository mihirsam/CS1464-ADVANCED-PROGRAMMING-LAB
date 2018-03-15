
class Student
{
  int num1, num2;

  void input(int x, int y)
  {
    num1 = x + 300;
    num2 = y + 200;
  }

  void display()
  {
    System.out.println("Num1 = "+num1+" and Num2 = "+num2);
  }

}

class StudentMain
{
  public static void main(String args[])
  {
    Student ob1 = new Student();
    Student ob2 = new Student();

    ob1.input(250, 200);
    ob1.display();

    //ob2.input();
    ob2.display();
  }
}
