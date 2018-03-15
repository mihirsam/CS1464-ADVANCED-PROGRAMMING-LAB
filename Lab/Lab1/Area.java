import java.util.Scanner;

class Calc
{
  float length, bredth, result;

  Calc input()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length : ");
    this.length = sc.nextFloat();
    System.out.println("\nEnter the bredth : ");
    this.bredth = sc.nextFloat();
    return this;
  }

  Calc compute()
  {
    this.result = length * bredth;
    return this;
  }
}
class Area
{
  public static void main(String args[])
  {
        Calc ob1 = new Calc();
        Calc ob2;
        Calc ob3;
        //float result;

        ob2 = ob1.input();
        ob3 = ob2.compute();

        System.out.println("\nArea of the Rectangle : "+ob3.result);
  }
}
