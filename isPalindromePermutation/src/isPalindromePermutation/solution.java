
package isPalindromePermutation;
import java.util.*;

public class solution {
	public boolean isPalindromePerm(String str)
	{
		int countodd=0;
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		
		for (char ch : str.toCharArray())
		{
			int x= getNumVal(ch);
			if(x!=-1)
			{
				table[x]++;
			
				if(table[x]%2==1)
				{
					countodd++;
				}
				else
				{
					countodd--;
				}
		    }
		}
		return(countodd<=1);
		
	}
	public int getNumVal(char x)
	{
		int val= Character.getNumericValue(x);
		int a= Character.getNumericValue('a');
		int z=Character.getNumericValue('z');
		if(val>=a&& val<=z)
		{
			return val-a;
		}
		return -1;
	}

	public static void main(String[] args) {
		solution m=new solution();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
	      String str =input.nextLine();
	      if (m.isPalindromePerm(str))
	      {
	    	  System.out.println("Palindrome Permutation!");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Not Palindrome Permutation!");
	      }

	}

}
