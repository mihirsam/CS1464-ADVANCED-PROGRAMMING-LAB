import java.util.Scanner;

class Library
{
  public void In(String name)
  {
    System.out.print(name+" Has Entered The Central Library !");
    Thread.suspend();
  }

  public void Out()
  {
    Thread.resume();
    System.out.print("Bye Bye");
  }
}

class Caller extends Thread
{
  String name, name1;
  Library target;
  Thread t;

  public void Enter1(Library targ, String s)
  {
    target = targ;
    name = s;
    targ.In(name);
  }

  public void Exit1(Library targ)
  {
    target = targ;
    target.Out();
  }

  public void run()
  {
    target.In(name);
  }
}

class LibraryMain
{
  public static void main(String args[])
  {
    int capacity = 100, choice1, i=0;
    String choice2;
    Library target = new Library();
    Caller arr[] = new Caller[100];
    Scanner sc = new Scanner(System.in);

    while(true)
    {
      System.out.println("\n\nWelcome To Library:\n1.Enter\n2.Exit\n3.Details\n4.Turn Off\nChoice : ");
      choice1 = sc.nextInt();

      if(choice1 == 1)
      {
        System.out.print("Enter The Name : ");
        arr[i].name1 = sc.next();
        arr[i] = new Caller();
        i++;
        arr[i-1].Enter1(target, arr[i-1].name);
      }

      else if(choice1 == 2)
      {
        System.out.print("Enter The Name : ");
        choice2 = sc.next();

        for(int j=0;j<=i; j++)
        {
          if(arr[j].name == choice2)
          {
            arr[j].Exit1(target);
          }
          else
          {
            System.out.println("No Such User Found!");
          }
        }
      }

      else if(choice1 == 4)
      {
        break;
      }
    }
  }
}
