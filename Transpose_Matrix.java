import java.util.*;
class Transpose_Matrix
{
	 public static void main(String args[])
	 {
		 int i,j;
		 System.out.println(" Enter total rows and colums:");
		 Scanner scan=new Scanner(System.in);
		 int row=scan.nextInt();
		 int column=scan.nextInt();
		 int array[][]=new int[row][column];
		 System.out.println(" Enter Matrix");
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<column;j++)
			 {
				 array[i][j]=scan.nextInt();
				 System.out.print(" ");
			 }
		 }
		 System.out.println("The above matrix before transpose is \n");
		 for(i=0;i<row;i++)
		 {
			 for(j=0;j<column;j++)
			 {
				 System.out.println(array[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
		 System.out.println("\n The above matrix after transpose is");
		 for(i=0;i<column;i++)
		 {
			 for(j=0;j<row;j++)
			 {
				 System.out.println(array[j][i]+"");
			 }
			 System.out.println(" ");
		 }
	 }
}