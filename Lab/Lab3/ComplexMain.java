import java.util.Scanner;

class Complex
{
  int real, imag;
  Scanner sc = new Scanner(System.in);

  Complex Add(int x, Complex ob1)
  {
    Complex obj = new Complex();

    System.out.println("Enter the imaginary part of number 1 : ");
    obj.imag = sc.nextInt();
    obj.real = x;
    obj.real = obj.real + ob1.real;
    obj.imag = obj.imag + ob1.imag;

    return obj;
  }

  Complex Add(Complex ob1, Complex ob2)
  {
    Complex obj = new Complex();

    /*
    System.out.println("\nEnter the real part of number 1 : ");
    ob1.real = sc.nextInt();
    System.out.println("Enter the imaginary part of number 1 : ");
    ob1.imag = sc.nextInt();

    System.out.println("Enter the real part of number 2 : ");
    ob2.real = sc.nextInt();
    System.out.println("Enter the imaginary part of number 2 : ");
    ob2.imag = sc.nextInt();
    */

    obj.real = ob1.real + ob2.real;
    obj.imag = ob1.imag + ob2.imag;

    return obj;
  }
}

class ComplexMain
{
  public static void main(String args[])
  {
    Complex ob1 = new Complex();
    Complex ob2 = new Complex();
    Complex ob3;
    Scanner sc = new Scanner(System.in);

    int x = 0;

    System.out.println("\nEnter the real part of numhber 1 : ");
    x = sc.nextInt();
    System.out.println("Enter the real part of number 2 : ");
    ob2.real =  sc.nextInt();
    System.out.println("Enter the imaginary part of number 2 : ");
    ob2.imag = sc.nextInt();


    ob3 = ob1.Add(x, ob2);
    System.out.println("Sum : "+ob3.real+" + "+ob3.imag+"i");

    ob1.real = x;
    System.out.println("Enter the imaginary part of number 1 : ");
    ob1.imag = sc.nextInt();
    ob3 = ob1.Add(ob1,ob2);
    System.out.println("Sum : "+ob3.real+" + "+ob3.imag+"i");
  }
}
