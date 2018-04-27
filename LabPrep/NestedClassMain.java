class Nested
{
  void sum(int num1, int num2)
  {
    NestedClass obj = new NestedClass();
    obj.sum(num1, num2);
  }

  void sum(int num1, int num2, int num3)
  {
    NestedClass obj = new NestedClass();
    obj.sum(num1, num2, num3);
  }

  class NestedClass
  {
    void sum(int num1, int num2)
    {
      int temp;
      temp = num1 + num2;
      System.out.println(temp);
    }

    void sum(int num1, int num2, int num3)
    {
      int temp;
      temp = num1 + num2 + num3;
      System.out.println(temp);
    }
  }
}

class NestedClassMain
{
  public static void main(String args[])
  {
    int num1 = 10, num2 = 20, num3 = 30;
    Nested obj = new Nested();

    obj.sum(num1, num2, num3);
    obj.sum(num1, num2);
  }
}
