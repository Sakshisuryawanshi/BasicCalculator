import java.util.*;
class Pallindrom_Number
{
  public static void main(String args[])
  {
    int a,n,rem,rev=0;
    System.out.println("\n Enter any number ");
    Scanner scan=new Scanner(System.in);
    n=scan.nextInt();
    a=n;
    while(n>0)
    {
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }
    System.out.println("\n Reverse Number=  "+rev);
    if(a==rev)
       System.out.println("\n Number is Pallindrom");
    else
       System.out.println("\n Number is not Pallindrom ");
  }
}