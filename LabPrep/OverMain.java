class Overload
{
  Overload()
  {
    System.out.println("Overload Constructor");
  }

  Overload(int num1, int num2)
  {
    System.out.println("Parameterized Constructor!");
  }

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

class OverMain
{
  public static void main(String args[])
  {
    Overload obj1 = new Overload();
    Overload obj2 = new Overload(1,2);

    obj1.sum(1,2,3);
    obj2.sum(2,3);
  }
}
