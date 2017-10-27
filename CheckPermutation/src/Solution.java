
public class Solution {
	public boolean checkPermutation(String str1,String str2)
	{
		if (str1.length()!=str2.length())
		{
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
	public String sort(String str)
	{
		char[] array = str.toCharArray();
		java.util.Arrays.sort(array);
		return new String(array);
		
	}

	public static void main(String[] args) {

	}

}
