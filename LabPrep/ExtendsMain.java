class A
{
  A()
  {
    System.out.println("A constructor");
  }

  A(int num1)
  {
    System.out.println(num1);
  }
}

class B extends A
{
  B()
  {
    System.out.println("Hello");
  }
  B(int num1)
  {
    System.out.println("B constructor");
  }
}

class ExtendsMain
{
  public static void main(String args[])
  {
    B obj = new B();
  }
}
