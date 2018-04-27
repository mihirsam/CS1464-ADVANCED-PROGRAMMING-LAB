class StringMain
{
  public static void main(String args[])
  {
    String s1 = new String("Hello World");
    char chars[] = {'A', 'B', 'C', 'D', 'E'};
    String s2 = new String(chars);
    String s3;
    StringBuffer s4 = new StringBuffer("Hello World");

    s3 = s1;
    System.out.println(s1.charAt(10));
    System.out.println(s2);
    System.out.println(s3.length());

    s4.setCharAt(0,'M');
    System.out.println(s4);

    System.out.println(s1.equals(s2));
  }
}
