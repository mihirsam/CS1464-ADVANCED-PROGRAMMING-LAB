import java.util.Scanner;
//import java.lang.Exception;

class Even implements Runnable
{
  int num1, num2;

  public void Call(int x, int y)
  {
    for(int i=x;i<=y;i++)
    {
      if(i % 2 == 0)
      {
        System.out.println(i);
      }
    }
  }

  public void run()
  {
      Call(num1, num2);
  }
}

class EvenMain
{
  public static void main(String args[])
  {
    Even obj = new Even();
    Scanner sc = new Scanner(System.in);
    Thread t;

    System.out.print("Enter Number 1 : ");
    obj.num1 = sc.nextInt();
    System.out.print("Enter Number 2 : ");
    obj.num2 = sc.nextInt();

    t = new Thread(obj);
    t.start();
  }
}
