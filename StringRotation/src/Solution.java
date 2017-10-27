
public class Solution {
	public boolean isRotation(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		String s1s1= s1+s1;
		return (s1s1.indexOf(s2)!=-1);
		
	}

	public static void main(String[] args) 
	{

	}

}
