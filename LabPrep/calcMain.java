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
    char symArray[] = new char[input.length()];
    int flag1, flag2, numFlag = 0, symFlag = 0;

    for(int i=0; i<=input.length(); i++)
    {
      if(input[i] == "+" || input[i] == "-" || input[i] == "*" || input[i] == "/")
      {
        symArray[symFlag] = input [i];
        symFlag++;
      }
      else
      {
        numArray[numFlag] = Interger.parseInt(input[i]);
        numFlag++;
      }
    }

    int tempArray[] = new int[symFlag];
    int num2 = 1, tempNum1 = Interger.parseInt(numArray[0]), tempNum2 = Interger.parseInt(numArray[num2]);

    for(int i=0; i<symFlag; i++)
    {
      if(symArray[i] == '+')
      {
        tempNum1 = tempNum1 + tempNum2;
        tempNum2 = numArray[num2++];
      }

      else if(symArray[i] == '-')
      {
        tempNum1 = tempNum1 - tempNum2;
        tempNum2 = numArray[num2++];
      }

      else if(symArray[i] == '*')
      {
        tempNum1 = tempNum1 * tempNum2;
        tempNum2 = numArray[num2++];
      }

      else if(symArray[i] == '/')
      {
        tempNum1 = tempNum1 / tempNum2;
        tempNum2 = numArray[num2++];
      }

      else
      {
        System.out.println("Something Wrong!\nBye");
        break;
      }
    }

    System.out.println("Answer = "+tempNum1);
  }
}
