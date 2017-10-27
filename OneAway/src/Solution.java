
public class Solution {
	boolean oneEditAway(String str1, String str2)
	{
		if (str1.length()==str2.length())
		{
			return oneEditReplace(str1,str2);
		}
		else if(str1.length()>str2.length())
		{
			return oneEditInsert(str2,str1);
		}
		else if (str1.length()<str2.length())
		{
			return oneEditInsert(str1,str2);
		}
		return false;
	}
	boolean oneEditReplace(String s1,String s2)
	{
		boolean found =false;
		for (int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				if(found)
				{
					return false;
				}
				found=true;
			}
		}
		return true;
	}
	boolean oneEditInsert(String s1,String s2)
	{
		int index1=0;
		int index2=0;
		while(index2<s2.length()&& index1<s1.length())
		{
			if(s1.charAt(index1)!=s2.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				index1++;
			}
			else
			{
				index1++;
				index2++;
				
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
