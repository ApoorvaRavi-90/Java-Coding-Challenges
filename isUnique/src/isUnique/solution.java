package isUnique;

import java.util.Scanner;

public class solution {
public boolean IsUnique(String str)
{
	if (str.length()>128)
	{
		return false;
	}
	boolean found[] =new boolean[128];
	for (char x : str.toCharArray())
	{
		//int val= 
		if (found[x])
		{
			return false;
		}
		found[x]=true;
	}
	return true;
}
	public static void main(String[] args) {
		solution m=new solution();
	      Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
	      System.out.println("Enter the String:");
	      String S= input.nextLine();
	      if(m.IsUnique(S)){
	    	  System.out.println("Unique!");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Not Unique!");
	      }

	}

}
