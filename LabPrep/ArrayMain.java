import java.util.Scanner;

class ArrayMain
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr[];
    arr = new int[5];

    for(int i=0; i<5; i++)
    {
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<5; i++)
    {
      System.out.println(arr[i]);
    }

    int arr1[] = new int[5];

    for(int i=0; i<5; i++)
    {
      arr1[i] = sc.nextInt();
    }

    for(int i=0; i<5; i++)
    {
      System.out.println(arr1[i]);
    }
  }
}
