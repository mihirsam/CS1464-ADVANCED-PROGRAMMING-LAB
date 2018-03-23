class CallMe implements runnable
{
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
}
