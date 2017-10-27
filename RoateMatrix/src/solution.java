import java.util.*;
public class solution {
	public static void rotate(int[][] m)
	{
		int n=m.length;
		if (m.length!=m[0].length)
		{
			return;
		}
		for(int layer=0;layer<n/2;layer++)
		{
			int first=layer;
			int last=n-1-layer;
			for (int i=first;i<last;i++)
			{
				int offset= i-first;
				int top= m[first][i];
				m[first][i]=m[last-offset][first];
				m[last-offset][first]=m[last][last-offset];
				m[last][last-offset]=m[i][last];
				m[i][last]=top;
				
			}
			
		}
		return;
		
	}

	public static void main(String[] args) {
     solution m=new solution();
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
	      rotate(matrix);
	      
	      for (int i=0 ;i<matrix[0].length;i++)
	      {
	    	  for (int j=0;j<matrix.length;j++)
	    	  {
	    		  System.out.println(matrix[i][j]);
	    	  }
	      }

	}

}
