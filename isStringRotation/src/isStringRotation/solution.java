package isStringRotation;
import java.util.*;
public class solution {
	public boolean isStringRotation(String s,String t)
	{
		if (s.length()!=t.length())
		{
			return false;
		}
		String ss=s+s;
		int x= ss.indexOf(t);
		if(x!=-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		solution m=new solution();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String1 and String2:");
	      String S= input.nextLine();
	      String T = input.nextLine();
	      if (m.isStringRotation(S,T))
	      {
	    	  System.out.println("is rotation!");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Not rotation!");
	      }

	}

}
