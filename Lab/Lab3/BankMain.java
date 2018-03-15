import java.util.Scanner;

class Bank
{
  String acc_name, acc_type;
  int acc_no, acc_balance;
  Scanner sc = new Scanner(System.in);
  static int transaction=0;

  void input()
  {
    System.out.print("\nEnter the name : ");
    acc_name = sc.next();
    System.out.print("Enter the account number : ");
    acc_no = sc.nextInt();
    System.out.print("Enter the account type : ");
    acc_type = sc.next();
  }


  void dipo()
  {
    int diposit;

    System.out.print("\nEnter the amount to diposit : ");
    diposit = sc.nextInt();

    if(diposit < 0)
    {
      System.out.println("\nSorry,  Diposit can't be negative");
    }
    else
    {
      acc_balance = acc_balance + diposit;
      System.out.println("Deposit Successful!\nNew Account Balance : "+acc_balance);
      trans();
    }

  }

  void with()
  {
    int withraw;

    System.out.print("\nEnter the amount to withraw : ");
    withraw = sc.nextInt();

    if(withraw > acc_balance)
    {
      System.out.println("\nSorry, Insufficient balance.");
    }
    else if(withraw < 0)
    {
      System.out.println("\nSorry, Withdraw cannot be negative.");
    }
    else
    {
      acc_balance = acc_balance - withraw;
      System.out.println("Withdraw Successful!\nNew Account Balance : "+acc_balance);
      trans();
    }

  }

  void display()
  {
    System.out.println("\nAccount Name : "+acc_name);
    System.out.println("Account Number : "+acc_no);
    System.out.println("Account Type : "+acc_type);

    System.out.println("Current Balance : "+acc_balance);
    System.out.println("Total Transaction : "+transaction);
  }

  static void trans()
  {
    transaction++;
  }
}

class  BankMain
{
  public static void main(String args[])
  {
    Bank obj = new Bank();
    int flag = 1, choice;
    Scanner sc = new Scanner(System.in);

    while(flag==1)
    {
      System.out.println("\n1.Input Details\n2.Display\n3.Deposit\n4.Withraw\n5.Exit\n");
      choice = sc.nextInt();

      if(choice == 1)
      {
        obj.input();
      }
      else if(choice == 2)
      {
        obj.display();
      }
      else if(choice == 3)
      {
        obj.dipo();
      }
      else if(choice == 4)
      {
        obj.with();
      }
      else if(choice == 5)
      {
        break;
      }
      else
      {
        System.out.println("\nInvalid Input!");
      }
    }
  }
}
