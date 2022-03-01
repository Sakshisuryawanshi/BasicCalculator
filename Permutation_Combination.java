import java.util.*;
public class Permutation_Combination
{
   public static long fact(int num)
   {
      int fact=1,i;
      for(i=1;i<=num;i++)
      {
         fact=fact*i;
      }
      return fact;
    }
   public static void main(String args[])
   {
     int n,r;
     Scanner scan=new Scanner(System.in);
     System.out.println("enter value of n and r");
      n=scan.nextInt();
      r=scan.nextInt();
      System.out.println("enter a value of n: "+n);
      System.out.println("enter value of r "+r);
      int ncr=(int)(fact(n)/ (fact(n-r)*(fact(r))));
      int npr=(int)(fact(n) / (fact(n-r)));
      System.out.println("nPr iS: "+npr);
      System.out.println("nCr iS: "+ncr);
   }
}
