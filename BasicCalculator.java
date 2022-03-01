import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator
{
   public static void main(String args[])
   {
      int num1,num2;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number");
      num1=scan.nextInt();
      num2=scan.nextInt();
      System.out.println("\n Enter the operation(+,-,*,/) ");
      char op=scan.next().charAt(0);
      double a=0;
      switch(op)
      {
         case '+':
                   a=num1+num2;
                   break;
         case '-':
                   a=num1-num2;
                   break;
        case '*':
                   a=num1*num2;
                   break;
        case '/':
                  a=num1/num2;
                  break;
        default:
                 System.out.println("\n You enter wrong input");
                 break;
    }
    System.out.println("\n final result ");
    System.out.println();
    System.out.println(num1 + "  "+ op + " " +num2 + " = "+a);
  }
}
