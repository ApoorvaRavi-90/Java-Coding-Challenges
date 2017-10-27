import java.util.*;
public class solution {
	public char[][] TOKENS={{'{','}'},{'[',']'},{'(',')'}};
	boolean isOpenTerm(char c)
	{
		for (char[] array:TOKENS)
		{
			if (array[0]==c)
			{
				return true;
			}
		}
		return false;
	}
	boolean matches(char OpenTerm,char CloseTerm)
	{
		for (char[] array:TOKENS)
		{
			if (array[0]==OpenTerm)
			{
				return (array[1]==CloseTerm);
			}
		}
		return false;
		
	}
	boolean isBalanced(String expression)
	{
		Stack<Character> stack1 =new Stack<Character>();
		for(char c:expression.toCharArray())
		{
			if (isOpenTerm(c))
			{
				stack1.push(c);
			}
			else
			{
				if(stack1.isEmpty()|| !matches(stack1.pop(),c)) return false;
			}
		}
		return stack1.isEmpty();
	}
	

	public static void main(String[] args) {
		solution s =new solution();
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the expression:");
		String x=in.nextLine();
		if(s.isBalanced(x))
		{
			System.out.println("balanced!");
		}
		else
		{
			System.out.println("Not Balanced!");
		}
		// TODO Auto-generated method stub

	}

}
