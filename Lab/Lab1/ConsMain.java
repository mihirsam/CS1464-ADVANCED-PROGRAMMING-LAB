class Cons
{
  int num1, num2;

  Cons()
  {
    num1 = 10;
    num2 = 20;
    System.out.println("This is constructor\n");
  }

  Cons(int x, int y)
  {
    num1 = x + 100;
    num2 = y + 200;
    System.out.println("This is parameterized constructor\n");
  }

  void display()
  {
    System.out.println("num1 = "+num1+" and num2 = "+num2);
  }
}

class ConsMain
{
  public static void main(String args[])
  {
    Cons ob1 = new Cons();
    Cons ob2 = new Cons(50,100);

    ob1.display();
    ob2.display();
  }
}
