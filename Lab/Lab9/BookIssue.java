import java.util.Scanner;

class Library
{
  synchronized int Wait(String name, int count)
  {
    System.out.println("\t\t\t"+name+" Is In Waiting List");
    try
    {
      Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
    }
    count++;
    count = Issue(name, count);
    //System.out.println("Done!");
    return count;

  }

  synchronized int Issue(String name, int count)
  {
    System.out.println("\t\t\t"+name+" Has Issued The Book");

    try
    {
      Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
    }

    System.out.println("\t\t\t\t"+name+" Has Returned The Book");

    count++;
    //System.out.println("Done!");
    return count;
  }
}


class Manager implements Runnable
{
  String name, msg;
  int count;
  Library target;
  Thread t;

  public int Input(Library targ, String s, int c)
  {
    target = targ;
    msg = s;
    t = new Thread(this);
    count = c;
    count--;
    t.start();
    //System.out.println("Start End!");
    return count;
  }

  synchronized public void run()
  {
    if(count >= 0)
    {
      count = target.Issue(msg, count);
    }
    else
    {
      count = target.Wait(msg, count);
    }
  }
}

class BookIssue
{
  public static void main(String args[])
  {
    int count = 5, choice, j=0;
    Library target = new Library();
    Manager arr[] = new Manager[50];
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<50;i++)
    {
      arr[i] = new Manager();
    }

    while(true)
    {
      if(j == 50)
      {
        j = 0;
      }

      System.out.println("\n\nWelcome To Library\nTotal Book Count : "+count);
      System.out.print("\n1.Book\n2.Exit\nChoice : ");
      choice = sc.nextInt();

      if(choice == 1)
      {
        System.out.print("\nEnter The Name : ");
        arr[j].name = sc.next();
        if(choice == 1)
        count = arr[j].Input(target, arr[j].name, count);
        j++;
      }

      else if(choice == 2)
      {
        System.out.println("\n\nBye Bye");
        break;
      }

      else
      {
        System.out.println("Invalid Input!");
      }
    }
  }
}
