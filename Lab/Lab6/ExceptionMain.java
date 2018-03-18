class ExceptionMain
{
  public static void main(String args[])
  {
    int temp1, temp2, i;
    float temp3;

    temp2 = args.length;

    for(i=0;i<temp2;i++)
    {
      try
      {
        temp3 = Float.parseFloat(args[i]);
        System.out.println("Invalid Input!");
      }
      catch(Exception e)
      {
        System.out.println("Valid Input!");
      }
    }
    System.out.println("Bye Bye!");
  }
}
