//error!
class Normal
{
  int i=0;
  static int num = 0;

  void test()
  {
    System.out.println("Test method!");
  }

  void nested()
  {
    for(i=0;i<10;i++)
    {
      class Try
      {
        void display()
        {
          System.out.println("Luck you all! "+num);
          num++;
        }
      }
      call();
    }

  }

    void call()
    {
      Try obj = new Try();
      obj.dispay();
    }
}

class NestedClassLoop
{
  public static void main(String[] args)
  {
    Normal obj = new Normal();
    obj.nested();
  }
}
