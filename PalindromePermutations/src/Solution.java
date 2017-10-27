import java.util.*;
public class Solution {
	public boolean isPalindromePermutation (String str)
	{
		int[] table =new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		int countOdd=0;
		char[] array=str.toCharArray();
		for (char c : array)
		{
			int x=getCharValue(c);
			if(x!=-1)
			{
				table[x]++;
				if(table[x]%2==1)
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
	int getCharValue(char c)
	{
		int a=Character.getNumericValue('a');
		int z=Character.getNumericValue('z');
		int val=Character.getNumericValue(c);
		if (a<=val && val<=z)
		{
			return val-a;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
