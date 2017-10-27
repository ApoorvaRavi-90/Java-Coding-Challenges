import java.util.*;
public class solution {
public boolean oneEditReplace( String str1, String str2)
{
	boolean found=false;
	int index1=0,index2=0;
	if(str1.length()!=str2.length())
	{
		return false;
	}
	for (int i=0;i<str1.length();i++)
	{
		if(str1.charAt(i)!=str2.charAt(i))
		{
			if (found)
			{
				return false;
			}
			
			found=true;			
		}
		
	}
	return true;
	
}
public boolean oneEditInsert(String str1, String str2)
{
	boolean found=false;
	int index1=0,index2=0;
	for (int i=0;i<str2.length();i++)
	{
		if (str1.charAt(index1)!=str2.charAt(index2))
		{
			if(found)
			{
				return false;
			}
			index2++;
			found=true;
		}
		else
		{
			index1++;
			index2++;
		}
	}
	return true;
}
public boolean isOneAway(String s, String t)
{
	if (s.length()==t.length())
	{
		return (oneEditReplace(s,t));
	}
	else if(s.length()<t.length())
	{
		return oneEditInsert(s,t);
	}
	else if(s.length()>t.length())
	{
		return oneEditInsert(t,s);
	}
	return false;
	}
	public static void main(String[] args) {
		solution m=new solution ();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String1 and String2:");
	      String S= input.nextLine();
	      String T = input.nextLine();
	      if (m.isOneAway(S,T))
	      {
	    	  System.out.println("is One Away!");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Not One Away!");
	      }

	}

}
