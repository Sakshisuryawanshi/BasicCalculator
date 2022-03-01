import java.util.*;
class Fibonacies_Series
{
   public static void main(String args[])
   {
     int f=1,s=1,t,i,range;
     System.out.println("\n Enter any range ");
     Scanner scan=new Scanner(System.in);
     range=scan.nextInt();
     System.out.println("\n fibonancies series");
     System.out.println("\n "+f+" "+s+" ");
     for(i=1;i<=range;i++)
     {
       t=f+s;
       System.out.println("\n "+t);
       f=s;
       s=t;
     }
   }
}
     