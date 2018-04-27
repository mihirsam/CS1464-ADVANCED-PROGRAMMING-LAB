//static datamembers, methods and command line arguments
class StaticDemo
{
  static int num1  = 10, num2 = 20;

}
class CommandLineMain
{
  public static void main(String args[])
  {
    for(int i=0; i< args.length; i++)
    {
      System.out.println(args[i]);
    }

    StaticDemo obj1 = new StaticDemo();
    StaticDemo obj2 = new StaticDemo();

    System.out.println("Obj1 : "+obj1.num1+" and obj2 : "+obj2.num1);
    obj1.num1 = 100;
    System.out.println("Obj1 : "+obj1.num1+" and obj2 : "+obj2.num1);

  }
}
