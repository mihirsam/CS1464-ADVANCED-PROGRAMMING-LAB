import java.util.Scanner;

class Book extends Thread
{
  String name, source, dest, b_type;
  int age, t_no, status;
  Scanner sc = new Scanner(System.in);

  int run(int seat)
  {
    if(seat > 0)
    {
      System.out.print("\n\nEnter the Name : ");
      name = sc.next();
      System.out.print("Enter the Age : ");
      age = sc.nextInt();
      System.out.print("Enter the Source : ");
      source = sc.next();
      System.out.print("Enter the Destination : ");
      dest = sc.next();
      System.out.print("Enter the Train Number : ");
      t_no = sc.nextInt();
      System.out.print("Enter the Berth Type : ");
      b_type = sc.next();

      seat--;
      status = 1;
      System.out.println("Booking Successful!");
      return seat;
    }

    else
    {
      System.out.println("\nSorry, Seat Full !");
      return seat;
    }
  }
}

class TicketMain
{
  public static void main(String args[])
  {
    int i, seat = 2;
    Book arr[] = new Book[5];

    for(i=0;i<5;i++)
    {
      arr[i] = new Book();
      seat = arr[i].run(seat);
    }

    System.out.println("\nSuccesful Booking : ");
    for(i=0;i<5;i++)
    {
      if(arr[i].status == 1)
      {
        System.out.println("\n\nName : "+arr[i].name);
        System.out.println("Age : "+arr[i].age);
        System.out.println("Source : "+arr[i].source);
        System.out.println("Destination : "+arr[i].dest);
        System.out.println("Train Number : "+arr[i].t_no);
        System.out.println("Berth Type : "+arr[i].b_type);
      }
    }

    System.out.println("\n\nUnsuccessful Booking : ");
    for(i=0;i<5;i++)
    {
      if(arr[i].status == 0)
      {
        System.out.println("\narr["+i+"]");
      }
    }
  }
}
