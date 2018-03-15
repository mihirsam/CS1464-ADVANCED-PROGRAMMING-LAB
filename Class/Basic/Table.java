class Table
{
  public static void main(String args[])
  {
    int a[][] = new int[19][10];
    int i, j, t=2, x=1 ;

    for(i=0;i<19;i++)
    {
      for(j=0;j<10;j++)
      {
        a[i][j] = t * x;
        x++;
      }
      t++;
      x = 1;
    }

    for(i=0;i<19;i++)
    {
      for(j=0;j<10;j++)
      {
        System.out.print(a[i][j]+"  ");
      }
      System.out.print("\n");
    }
  }
}
