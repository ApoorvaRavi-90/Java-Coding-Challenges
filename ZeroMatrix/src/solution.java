import java.util.*;
public class solution {
	public static void ZeroMat(int[][] matrix)
	{
		boolean rowhaszero=false;
		boolean colhaszero=false;
		for(int j=0;j<matrix[0].length;j++)
		{
			if (matrix[0][j]==0)
			{
				rowhaszero=true;
				break;
			}
		}
		for(int i=0;i<matrix.length;i++)
		{
			if (matrix[i][0]==0)
			{
				colhaszero=true;
				break;
			}
		}
		
		for(int i=0;i<matrix[0].length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for (int i=1;i<matrix.length;i++)
		{
			if(matrix[i][0]==0)
			{
				nullifyrows(matrix,i);
			}
			
		}
		for (int i=1;i<matrix[0].length;i++)
		{
			if(matrix[0][i]==0)
			{
				nullifycols(matrix,i);
			}
			
		}
		if (rowhaszero)
		{
			nullifyrows(matrix,0);
		}
		if (colhaszero)
		{
			nullifycols(matrix,0);
		}
		
	}
	public static void nullifyrows(int[][] matrix,int row)
	{
		for(int i=0;i<matrix[0].length;i++)
		{
			matrix[row][i]=0;
		}
		
	}
	public static void nullifycols(int[][] matrix,int col)
	{
		for(int i=0;i<matrix.length;i++)
		{
			matrix[i][col]=0;
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the matrix :");
	      int row=3;
	      int col=3;
	      int[][] matrix = new int[row][col];
	      for (int i=0 ;i<matrix[0].length;i++)
	      {
	    	  for (int j=0;j<matrix.length;j++)
	    	  {
	    		  matrix[i][j]=input.nextInt();
	    	  }
	      }
	      ZeroMat(matrix);
	      for (int i=0 ;i<matrix[0].length;i++)
	      {
	    	  for (int j=0;j<matrix.length;j++)
	    	  {
	    		  System.out.println(matrix[i][j]);
	    	  }
	      }

	}

}
