import java.util.Scanner;

class Calc
{
  int x, y;

  void input()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length : ");
    x = sc.nextFloat;
    System.out.println("Enter the bredth : ");
    y = sc.nextFloat;
  }
}
class Area
{
  public static void main(String args[])
        Calc ob1;
        int result;

        ob1.input();
        result = ob1.x * ob1.y;

//        System.out.println("Area of the Rectangle : "+result);
  }
}
