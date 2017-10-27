import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Main m=new Main();
      Scanner input = new Scanner(System.in);
      /* *******************************************************************
       * Is Unique
       *********************************************************************/
      /*System.out.println("Enter the String:");
      String S= input.nextLine();
      if(m.isUnique(S)){
    	  System.out.println("Unique!");
    	  
      }
      else
      {
    	  System.out.println("Not Unique!");
      }*/
      
      
      
      
      /* *******************************************************************
       * Is permutation
       *********************************************************************/
      /*System.out.println("Enter the String1 and String2:");
      String S= input.nextLine();
      String T = input.nextLine();
      if (m.isPermutation(S,T))
      {
    	  System.out.println("Permutation!");
    	  
      }
      else
      {
    	  System.out.println("Not Permutation!");
      }*/
      
      
      
      
      /* *******************************************************************
       * Replace space
       *********************************************************************/
      /*System.out.println("Enter the String:");
      String Str =input.nextLine();
      Str = Str.trim().replace(" ", "%20");
      System.out.println(Str);*/
      
      
      
      
      /* *******************************************************************
       * Palindrome Permutation
       *********************************************************************/
      /*System.out.println("Enter the String:");
      String str =input.nextLine();
      if (m.isPalindromePermutation(str))
      {
    	  System.out.println("Palindrome Permutation!");
    	  
      }
      else
      {
    	  System.out.println("Not Palindrome Permutation!");
      }*/
      
      
      
      /* *******************************************************************
       * One Away
       *********************************************************************/ 
      /*System.out.println("Enter the String1 and String2:");
      String S= input.nextLine();
      String T = input.nextLine();
      if (m.isOneAway(S,T))
      {
    	  System.out.println("is One Away!");
    	  
      }
      else
      {
    	  System.out.println("Not One Away!");
      }*/
      
      
      
      
      /* *******************************************************************
       * String Compression
       *********************************************************************/ 
      /*System.out.println("Enter the String:");
      String str =input.nextLine();      
      System.out.println(m.stringCompression(str));*/
      
      
      
      
      /* *******************************************************************
       * Rotate Matrix by 90
       *********************************************************************/
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
      m.rotateMatrix(matrix);
      
      /* *******************************************************************
       * Zero Matrix
       *********************************************************************/
      /*System.out.println("Enter the matrix :");
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
      //System.out.println(matrix);
      m.zeroMatrix(matrix);*/
      
	}
    //*****************************************************************************

	boolean  isUnique(String str)
	{
		if (str.length()>128){
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i=0; i<str.length();i++)
		{
			int x= str.charAt(i);
			if(char_set[x])
			{
				return false;
			}
			char_set[x] =true;
		}
		return true;
	}
	
    //*****************************************************************************

	String sort(String str)
	{
		char[] s = str.toCharArray();
		java.util.Arrays.sort(s);;
		return new String (s);
	}
    boolean isPermutation(String str1, String str2)
    {    	
    	if (str1.length()!= str2.length())
    	{
    		return false;
    	}
    	return sort(str1).equals(sort(str2));
	
    }
    //*****************************************************************************

    boolean isPalindromePermutation(String phrase)
    {
    	int countOdd=0;
    	int[] table = new int[(Character.getNumericValue('z')
    			              -Character.getNumericValue('a')+1)];
    	for(char c: phrase.toCharArray())
    	{
    		int x=getCharVal(c);
    		if (x!= -1)
    				{
    			     table[x]++;
    			     if (table[x]%2==1)
    			     {
    			    	 countOdd++;
    			     }
    			     else
    			     {
    			    	 countOdd--;
    			     }
    				}    		
    	}
    	return countOdd<=1;
    }
    
    int getCharVal (char c)
    {
    	int a = Character.getNumericValue('a');
    	int z=  Character.getNumericValue('z');
    	int val = Character.getNumericValue(c);
    	if (val>= a && val<=z)
    	{
    		return val-a;
    	}
    	return -1;
    	    }
    
    //*****************************************************************************

    boolean isOneAway(String first, String second)
    {
    	if (first.length() ==second.length())
    	{
    		return oneEditReplace(first, second);
    	}
    	else if(first.length()+1==second.length())
    	{
    		return oneEditInsert(first,second);
    	}
    	else if(first.length()==second.length()+1)
    	{
    		return oneEditInsert(second, first);
    	}
    	return false;
    }
    boolean oneEditReplace(String one, String two)
    {
    	boolean founddiff = false;
    	for (int i=0;i<one.length();i++)
    	{
    		if(one.charAt(i)!=two.charAt(i))
    		{
    		  if (founddiff)
    		  	{
    			  return false;
    		  	}
    		}
    		founddiff= true;
    	}
    	return true;
    }
    boolean oneEditInsert(String one, String two)
    {
    	int i=0;
    	int j =0;
    	while (i<one.length() && j<two.length())
    	{
    		if (one.charAt(i)!=two.charAt(j))
    		{  
    			if (i!=j)
    			{
    				return false;
    			}
    			j++;
    			
    		}
    		else
    		{
    			i++;
    			j++;
    		}
    	}
    	return true;
    }
    
    //*****************************************************************************
  
    String stringCompression(String str)
    {
    	StringBuilder s=new StringBuilder();
    	int countConsecutive=0;
    	for (int i=0;i<str.length();i++)
    	{
    		countConsecutive++;
    		if(i+1>=str.length()|| str.charAt(i)!= str.charAt(i+1))
    		{
    			s.append(str.charAt(i));
    			s.append(countConsecutive);
    			countConsecutive=0;
    		}
    		
    	}
    	return s.length()<str.length()? s.toString():str;
    }
    //*****************************************************************************
    void zeroMatrix(int[][] data)
    {
    	boolean rowhaszero=false;
    	boolean colhaszero =false;
    	for (int j=0;j<data[0].length;j++)
    	{
    		if (data[0][j]==0)
    		{
    			rowhaszero=true;
    			break;
    		}
    	}
    	for (int i=0;i<data.length;i++)
    	{
    		if (data[i][0]==0)
    		{
    			colhaszero=true;
    			break;
    		}
    	}
    	for (int i=0;i<data.length;i++)
    	{
    		for (int j=0;j<data[0].length;j++)
    		{
    			if (data[i][j]==0)
    			{
    				data[i][0]=0;
    				data[0][j]=0;
    			}
    				    			
    		}
    	}
    	for (int i=0;i<data.length;i++)
    	{
    		if (data[i][0]==0)
    		{ nullifyRows(data,i);}
    	}
    	for (int j=0;j<data[0].length;j++)
    	{
    		if (data[0][j]==0)
    		{nullifyCols(data,j);
    		}
    	}
    	if (rowhaszero)
    	{
    		nullifyRows(data,0);
    	}
    	if (colhaszero)
    	{
    		nullifyCols(data,0); 
    	}
    	
    	for (int i=0 ;i<data[0].length;i++)
        {
      	  for (int j=0;j<data.length;j++)
      	  {
      		  System.out.println(data[i][j]);
      	  }
        }
    	
    }
    
    void nullifyRows(int[][] matrix,int row)
    {
    	for (int j=0;j<matrix[0].length;j++)
    	{
    		matrix[row][j]=0;
    	}
    }
    void nullifyCols(int[][] matrix,int col)
    {
    	for (int i=0;i<matrix.length;i++)
    	{
    		matrix[i][col]=0;
    	}
    }
    
    // ***************************************************************************
    boolean rotateMatrix(int[][] matrix)
    {
    	if (matrix.length==0|| matrix[0].length!=matrix.length) return false;
    	
    	int n=matrix.length;
    	for (int layer =0;layer<n/2;layer++)
    	{
    		int first= layer;
    		int last= n-1-layer;
    		for (int i= first;i<last;i++)
    		{
    			int offset= i-first;
    			int top=matrix[first][i];
    			matrix[first][i]=matrix[last-offset][first];
    			matrix[last-offset][first]=matrix[i][last];
    			matrix[i][last]=top;
    		}
    	}
    	return true;
    }
    			
    			
    		
    	
}

