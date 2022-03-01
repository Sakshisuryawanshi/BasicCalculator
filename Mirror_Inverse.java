import java.util.*;
public class Mirror_Inverse
{
   static boolean isMirrorInverse(int arr[])
   {
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[arr[i]]!=i)
			   return false;
	   }
	   return true;
   }
   public static void main(String args[])
   {
	   int arr[]= {3,4,2,0,1};
	   if(isMirrorInverse(arr))
		   System.out.println("yes");
	   else
		   System.out.println("No");
 	   }
   }