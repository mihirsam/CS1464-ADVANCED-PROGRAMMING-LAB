import java.util.Scanner;

abstract class Account
{
  int acc_no, acc_bal;
  String cust_name, acc_type;
  static int total_trans = 0;
  Scanner sc = new Scanner(System.in);

  Account()
  {
    System.out.println("Welcome to Bank!");
  }

  abstract void info();

  void withraw()
  {
    int withraw;

    System.out.println("\nEnter the amount to withraw : ");
    withraw = sc.nextInt();

    if(withraw > acc_bal)
    {
      System.out.println("\nSorry, Insufficient Balance!");
    }
    else if(withraw < 0)
    {
      System.out.println("\nSorry, Withraw cannot be negative!");
    }
    else
    {
      acc_bal = acc_bal - withraw;
      System.out.println("Withraw Succesful!\nNew Account Balance : "+acc_bal);
      trans();
    }
  }

  void deposit()
  {
    int deposit;
    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter the amount to deposit : ");
    deposit = sc.nextInt();

    if(deposit < 0)
    {
      System.out.println("\nSorry, Deposit cannot be negative!");
    }

    else
    {
      acc_bal = acc_bal + deposit;
      System.out.println("Deposit Succesful!\nNew Account Balance : "+acc_bal);
      trans();
    }

  }

  void display()
  {
    System.out.println("\nCustomer Name : "+cust_name);
    System.out.println("\nAccount Number : "+acc_no);
    System.out.println("\nAccount Type : "+acc_type);
    System.out.println("\nAccount Balance : "+acc_bal);
    System.out.println("\nTotal Transaction : "+total_trans);
  }

  void input()
  {
    System.out.print("\nEnter Customer Name : ");
    cust_name = sc.next();
    System.out.print("Enter Account Number : ");
    acc_no = sc.nextInt();
    System.out.print("Account Type : ");
    acc_type = sc.next();
  }

  static void trans()
  {
    total_trans++;
  }

  void run()
  {
    while(true  )
    {
      int choice ;
      System.out.println("\n1.Input\n2.Display\n3.Deposit\n4.Withraw\n5.Exit\nChoice : ");
      choice = sc.nextInt();

      if(choice == 1)
      {
        input();
      }
      else if(choice == 2)
      {
        display();
      }
      else if(choice == 3)
      {
        deposit();
      }
      else if(choice == 4)
      {
        withraw();
      }
      else if(choice == 5)
      {
        break;
      }
      else
      {
        System.out.println("Invalid Input");
      }
    }
  }

}

class S_Account extends Account
{
  static int s_trans_total = 0;

  S_Account(){
      s_trans_total = s_trans_total + total_trans;
  }

  void info()
  {
    System.out.println("In Saving Account : ");
  }
  void display()
  {
    System.out.println("\nCustomer Name : "+super.cust_name);
    System.out.println("\nAccount Number : "+super.acc_no);
    System.out.println("\nAccount Type : "+super.acc_type);
    System.out.println("\nAccount Balance : "+super.acc_bal);
    System.out.println("\nTotal Transaction : "+this.s_trans_total);
  }

}

class C_Account extends Account
{
  static int c_trans_total = 0;

  C_Account(){
      c_trans_total = c_trans_total + total_trans;
  }

  void info()
  {
    System.out.println("In Current Account : ");
  }
  void display()
  {
    System.out.println("\nCustomer Name : "+super.cust_name);
    System.out.println("\nAccount Number : "+super.acc_no);
    System.out.println("\nAccount Type : "+super.acc_type);
    System.out.println("\nAccount Balance : "+super.acc_bal);
    System.out.println("\nTotal Transaction : "+this.c_trans_total);
  }
}

class BankMain
{
  public static void main(String args[])
  {
    Account ob1;
    S_Account ob2 = new S_Account();
    C_Account ob3 = new C_Account();

    ob2.run();

    if(ob2.acc_type.equals('S') || ob2.acc_type.equals('s'))
    {
      ob2.display();
    }
    else
    {
      ob3.display();
    }
  }
}
