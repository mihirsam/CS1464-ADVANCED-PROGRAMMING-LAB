class Variable
{
  int x;

  Variable()
  {
    System.out.println(x);
  }
}

class VariableMain
{
  public static void main(String args[])
  {
    int x = 10;
    Variable obj = new Variable();
    obj.x = 100;
    System.out.println(x);
    System.out.println(obj.x);
    Variable ob2 = new Variable();
  }
}
