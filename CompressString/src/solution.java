import java.util.*;
public class solution {
	public String compressString(String s)
	{
		StringBuilder x=new StringBuilder();
		int count=0;
		for (int i=0;i<s.length();i++)
		{
			count++;
			if(i+1>=s.length()|| s.charAt(i)!= s.charAt(i+1))
					{
						x=x.append(s.charAt(i));
						x=x.append(count);
						count=0;
					}
		}
		return (x.length()<s.length()? x.toString(): s);
		
	}

	public static void main(String[] args) 
	{
		solution m=new solution();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
	      String str =input.nextLine();      
	      System.out.println(m.compressString(str));
	}

}
