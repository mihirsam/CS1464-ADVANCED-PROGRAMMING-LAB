import java.util.Scanner;

class stringSort
{
  public static void main(String args[])
  {
    String s[] = new String[10];
    String str = new String();
    Scanner sc = new Scanner(System.in);
    int flag = 0, top = 0, bottom, length, temp = 0, max = 0;
    int spaceFlag[] = new int[10];

    System.out.print("Enter The Paragraph :\n");
    str = sc.nextLine();
    length = str.length();

    try
    {
      for(int i=0; i<length; i++)
      {
        if(str.charAt(i)== '.' || str.charAt(i)== '!')
        {
          //String s[flag] = new String();
          bottom = i+1;
          s[flag] = str.substring(top, bottom);
          top = i;
          flag++;
        }
      }

      for(int i=0; i<flag; i++)
      {
        for(int j=0; j<s[i].length(); j++)
        {
          if(s[i].charAt(j) == ' ')
          {
            temp++;
          }

          spaceFlag[i] = temp;
          temp = 0;
        }
      }

      while(temp != 10)
      {
        for(int i=0; i<10; i++)
        {
          if(spaceFlag[i] > max)
          {
            flag = i;
            max = spaceFlag[i];
          }
        }
        System.out.println(s[spaceFlag[flag]]);
        spaceFlag[flag] = 0;
        max = 0;
        temp++;
      }

    }

    catch(Exception e)
    {
      System.out.println("\nPlease Don't Cross 10 Lines, Senpai (^.^)");
    }

  }
}
