import java.util.Scanner;

class queue
{
  int front = 0, rear = -1;
  int a[] = new int[5];
  Scanner sc = new Scanner(System.in);

  void insert()
  {
    int temp;

    System.out.print("Enter The Number To Insert : ");
    temp = sc.nextInt();

    if(rear == 4)
    {
      System.out.println("Insertion Failed! Queue Is Full!");
    }
    else
    {
      rear++;
      a[rear] = temp;
      System.out.println("Insertion Successful!");
    }
  }

  void delete()
  {
    if(rear < 0)
    {
      System.out.println("Deletion Failed! Queue Is Empty!");
    }
    else
    {
      for(int i=front; i<rear; i++)
      {
        a[i] = a[i+1];
      }

      rear--;
      System.out.println("Deletion Successful!");
    }
  }

  void display()
  {
    System.out.println("\nGiven Queue : ");
    for(int i=front; i<=rear; i++)
    {
      System.out.print(a[i]+"  ");
    }
  }

}

class queueMain
{
  public static void main(String args[])
  {
    queue q1 = new queue();
    Scanner sc = new Scanner(System.in);
    int choice;

    while(true)
    {
      System.out.print("\n\n1.Insert\n2.Delete\n3.Display\n4.Exit\nChoice : ");
      choice = sc.nextInt();

      if(choice == 1)
      {
        q1.insert();
      }
      else if(choice == 2)
      {
        q1.delete();
      }
      else if(choice == 3)
      {
        q1.display();
      }
      else if(choice == 4)
      {
        break;
      }
      else
      {
        System.out.println("Invalid Input!");
      }
    }
  }
}
