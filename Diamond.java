public class Diamond
{
 public static void main(String args[])
 {
  int i,j,k;
  for(i=0;i<=5;i++)
  {
   for(k=5;k>=i;k--)
   {
     System.out.print(" ");
   }
   for(j=1;j<=i;j++)
   {
    System.out.print(" *");
   }
   System.out.println(" ");
  }
  for(i=5;i>=1;i--)
  {
   
   for(k=5;k>=i;k--)
   {
    System.out.print(" ");
   }
   for(j=1;j<=i;j++)
   {
    System.out.print(" *");
   }
    System.out.println(" ");
  }
 }
}
