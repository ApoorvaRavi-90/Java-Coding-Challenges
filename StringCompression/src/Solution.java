
public class Solution {
	String compress(String str)
	{
		int countConsec=0;
		StringBuilder new_str = new StringBuilder();
		for (int i=0;i<str.length();i++)
		{
			countConsec++;
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1))
			{
				new_str.append(str.charAt(i));
				new_str.append(countConsec);
				countConsec=0;
			}
		}
		return (new_str.length()>str.length()?new_str.toString():str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
