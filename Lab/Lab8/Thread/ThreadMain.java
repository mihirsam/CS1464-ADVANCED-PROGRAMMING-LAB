class ThreadA extends Thread
{
  public void run()
  {
    for(int i =1;  i<= 10; i++)
    {
      System.out.println("i = "+i);
    }
    System.out.println("Exit from ThreadA!");
  }
}


class ThreadB extends Thread
{
  public void run()
  {
    for(int j=11; j<=20; j++)
    {
      System.out.println("j = "+j);
    }
    System.out.println("Exit from ThreadB!");
  }
}

class ThreadC extends Thread
{
  public void run()
  {
    for(int k=21; k <=30; k++)
    {
      System.out.println("k = "+k);
    }
    System.out.println("Exit from ThreadC!");
  }
}

class ThreadMain
{
  public static void main(String args[])
  {
    ThreadA ob1 = new ThreadA();
    ThreadB ob2 = new ThreadB();
    ThreadC ob3 = new ThreadC();

    ob1.start();
    ob2.start();
    ob3.start();
  }
}
