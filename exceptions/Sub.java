package exceptions;
//
//import java.io.*;
//
//class Super
//{
//  void show() {
//    System.out.println("parent class");
//  }
//}
//
//public class Sub extends Super
//{
//  void show()         //throws IOException                //Compile time error for throws IOException
//  {
//    System.out.println("parent class");
//  }
//
//  public static void main(String[] args)
//  {
//    Super s=new Sub();
//    s.show();
//  }
//}



import java.io.*;

class Super
{
  void show() {
    System.out.println("parent class");
  }
}

class Sub extends Super
{
  void show() throws ArrayIndexOutOfBoundsException
  {
    System.out.println("child class");
  }

  public static void main(String[] args)
  {
    Super s = new Sub();
    s.show();
  }
}

// for uncehcked exception it dosent throw any Error 