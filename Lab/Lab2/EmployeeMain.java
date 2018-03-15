import java.util.Scanner;

class Employee
{
  int emp_no ;
  double  basic, da, gross, it, net_sal;
  String emp_name;

  Employee input()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter Name of the employee : ");
    this.emp_name = sc.next();
    System.out.println("\nEnter employee number : ");
    this.emp_no = sc.nextInt();
    System.out.println("\nEnter basic salary : ");
    this.basic = sc.nextDouble();
    return this;
  }

  Employee calc()
  {
    this.da = 0.52 * basic;
    this.gross = basic + this.da;
    this.it = 0.30 * this.gross;
    this.net_sal = this.gross - this.it;
    return this;
  }

  void display()
  {
    System.out.println("\nName : "+emp_name+"\nEmployee Id : "+emp_no);
    System.out.println("\nBasic salary : "+basic);
    System.out.println("DA : "+da);
    System.out.println("Gross salary : "+gross);
    System.out.println("Income Tax : "+it);
    System.out.println("Net salary : "+net_sal);
  }
}

class EmployeeMain
{
  public static void main(String args[])
  {
    Employee ob1 = new Employee();
    Employee ob2;
    Employee ob3;

    ob2 = ob1.input();
    ob3 = ob2.calc();
    ob3.display();
  }
}
