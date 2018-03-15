import java.util.Scanner;
/*
class City
{

}
*/

class CityMain
{
  public static void main(String args[])
  {
    String s1 = new String();
    String s2 = new String();
    String s3 = new String();
    String s4 = new String();
    String s5 = new String();
    String s6 = new String();

    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the names of 5 cities : \n");

    s1 = s.nextLine();
    s2 = s.nextLine();
    s3 = s.nextLine();
    s4 = s.nextLine();
    s5 = s.nextLine();

    char c[] = {s1.charAt(0), s2.charAt(0), s3.charAt(0), s4.charAt(0), s5.charAt(0)};
/*
    char c[1] = s2.charAt(0);
    char c[2] = s3.charAt(0);
    char c[3] = s4.charAt(0);
    char c[4] = s5.charAt(0);
*/
    char temp[] = {'t'};

    for(int i=0;i<5;i++)
    {
      for(int j=0;j<5-i-1;j++)
      {
        if(c[j+1] < c[j])
        {
          temp[0] = c[j+1];
          c[j+1] = c[j];
          c[j] = temp[0];

        }
      }
    }

    System.out.println("\nThe sorted cities are : \n");
    int flag1 = 0;
    int flag2 = 0;
    int flag3 = 0;
    int flag4 = 0;
    int flag5 = 0;

    for(int i=0;i<5;i++)
    {
      if(c[i] == s1.charAt(0) && flag1 == 0)
      {
          System.out.println(s1);
          flag1++;
      }
      else if(c[i] == s2.charAt(0) && flag2 == 0)
      {
          System.out.println(s2);
          flag2++;
      }
      else if(c[i] == s3.charAt(0) && flag3 == 0)
      {
          System.out.println(s3);
          flag3++;
      }
      else if(c[i] == s4.charAt(0) && flag4 == 0)
      {
          System.out.println(s4);
          flag4++;
      }
      else if(c[i] == s5.charAt(0) && flag5 == 0)
      {
          System.out.println(s5);
          flag5++;
      }
    }
  }
}
