package isLongestPalindrome;
import java.util.*;

public class solution {
	public String longestPalindrome(String s)
	{
		int n= s.length();
		boolean[][] table = new boolean[n][n];
		int maxlength=0;
		//length of string =1
		for (int i=0;i<s.length();i++)
		{
			table[i][i]=true;
			maxlength=1;
			
		}
		
		int start=0;		
		//length of string =2
	    for (int i=0;i<n-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			
			{
				//start=2;
				table[i][i+1]=true;
				start=i;
				maxlength=2;
				
			}
			
		}
		
		//length of string >=3
	    
	    for (int k=3;k<n;++k)
	    {
	    	for (int i=0;i<n-k-1;++i)
	    	{
	    		int j= i+k-1;
	    		if(table[i+1][j-1] && s.charAt(i)==s.charAt(j))
	    		{
	    			table[i][j]=true;
	    			if(k>maxlength)
	    			{
	    				maxlength=k;
	    				start=i;
	    			}
	    		}
	    	}
	    }
		return s.substring(start, start+maxlength);
		
	}

	public static void main(String[] args) {
		solution m=new solution();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
	      String Str =input.nextLine();
	      //Str = Str.trim().replace(" ", "%20");
	      System.out.println(m.longestPalindrome(Str));
	      

	}

}
