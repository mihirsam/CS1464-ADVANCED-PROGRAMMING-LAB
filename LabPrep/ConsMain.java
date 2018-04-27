class Demo
{
  int num1 = 10, num2 = 20;
  Demo()
  {
    System.out.println("This is Demo Constructor");
  }

  void sum(int num1, int num2)
  {
    this.num2 = this.num1 + this.num1;
    System.out.println("Num2 : "+num2+"\nThis NUm2 : "+this.num2);
  }
}

class ConsMain
{
  public static void main(String args[])
  {
    Demo obj = new Demo();
    obj.sum(100, 200);
  }
}
