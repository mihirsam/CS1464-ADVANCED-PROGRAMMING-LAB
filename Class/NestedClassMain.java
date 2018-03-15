class Normal
{
  int num1 = 100;
  static int num2 = 100;

  void test()
  {
    Nested obj = new Nested();
    obj.display();
    System.out.println("Test method\nnum1:"+num1+"\nnum2:"+num2+"\n");
  }

  class Nested
  {
    void display()
    {
      num2 = num2 - 50;
      System.out.println("Nested class:\nnum1:"+num1+"\nnum2:"+num2+"\n");
    }
  }
}

class NestedClassMain
{
  public static void main(String args[])
  {
    Normal ob1 = new Normal();
    ob1.test();
  }
}
