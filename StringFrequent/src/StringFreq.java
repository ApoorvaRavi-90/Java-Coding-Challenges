import java.util.*;
public class StringFreq {

	public static void findDuplicates(String str)
	{
		HashMap<Character,Integer> set =new HashMap<Character,Integer>();
		char[] letters=str.toCharArray();
		if(str.length()==0)
		{
			System.out.println("error");
			return;
		}
		for (char c:letters)
		{
			if (set.containsKey(c))
			{
				set.put(c, (set.get(c)+1));				
			}
			else
			{
				set.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entry= set.entrySet();
		{
			for(Map.Entry<Character, Integer> x:entry)
			{
				if(x.getValue()>1)
				{
					System.out.println(x.getKey()+ " : "+x.getValue());
				}
			}
		}
		
	}
	public boolean isAnagram(String str1, String str2)
	{
		if (str1.length()!=str2.length())
		{
			return false;
		}
		return (sort(str1).equals(sort(str2)));
	}
	public String sort(String str)
	{
		char[] letters =str.toCharArray();
		java.util.Arrays.sort(letters);
		return new String (letters);
	}
	public static String reverseString(String str)
	{
		char[] r1= str.toCharArray();
		int len=str.length();
		char[] r2=new char[len];
		for(int i=0;i<len;i++)
		{
			r2[i]=r1[len-1-i];
		}
		return new String(r2);
	}
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.nextLine();
		//findDuplicates(str);
		System.out.println(reverseString(str));
		

	}

}
