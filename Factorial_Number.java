import java.util.*;
class Factorial_Number
{
  public static void main(String args[])
  {
     int fact=1,n;
     System.out.println("\n Enter any number ");
     Scanner scan=new Scanner(System.in);
     n=scan.nextInt();
     while(n>0)
     { 
        fact=fact*n;
        n--;
     }
     System.out.println("\n Factorial Number=   "+fact);
   }
}