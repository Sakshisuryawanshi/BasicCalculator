import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
    int a[]=new int[100];
    int n,rem,rev,i,b;
    System.out.println("\n Enter any array length ");
    Scanner scan=new Scanner(System.in);
    n=scan.nextInt();
    System.out.println("\n Enter any array elements ");
    for(i=0;i<n;i++)
    {
      a[i]=scan.nextInt();
      System.out.println("\n Given array elements are ");
      for(i=0;i<n;i++)
      {
         rev=0;
         b=a[i];
         while(b>0)
         {
            rem=b%10;
            rev=rev*10+rem;
            b=b/10;
         }
         System.out.println(a[i]+" = "+rev);
      }
     }
  }
  }
    