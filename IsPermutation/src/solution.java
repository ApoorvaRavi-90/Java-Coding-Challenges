import java.util.*;
public class solution {
public boolean isPermutation(String str1, String str2)
{
	if(str1.length()!=str2.length())
	{
		return false;
	}
	return sort(str1).equals(sort(str2));
}
public String sort(String s)
{
	char[] a= s.toCharArray();
	java.util.Arrays.sort(a);
	return new String(a);
}
	public static void main(String[] args) {
		solution m=new solution();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String1 and String2:");
	      String S= input.nextLine();
	      String T = input.nextLine();
	      if (m.isPermutation(S,T))
	      {
	    	  System.out.println("Permutation!");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Not Permutation!");
	      }
		// TODO Auto-generated method stub

	}

}
