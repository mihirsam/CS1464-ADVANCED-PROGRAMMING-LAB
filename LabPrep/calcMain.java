import java.util.Scanner;

class calcMain
{
  public static void main(String args[])
  {
    String input = new String();
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter The Equation : ");
    input = sc.next();

    int numArray[] = new int[input.length()];
    int symArray[] = new int[input.length()];
    int flag1, flag2, numFlag = 0, symFlag = 0;

    for(int i=0; i<=input.length(); i++)
    {
      if(a[i] == "+" || a[i] == "-" || a[i] == "*" || a[i] == "/")
      {
        symArray[symFlag] = a[i];
        symFlag++;
      }
      else
      {
        numArray[numFlag] = parse.Int(a[i])
        numFlag++;
      }
    }
    System.out.println("Input : "+input+"\nLength : "+input.length());
  }
}
