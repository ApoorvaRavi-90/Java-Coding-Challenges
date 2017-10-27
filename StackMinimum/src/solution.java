import java.util.*;
public class solution extends Stack<Integer>{
	Stack<Integer> s2;
	public solution()
	{
		s2=new Stack<Integer>();
	}
	public void push(int x)
	{
		if (x<=min())
		{
			s2.push(x);
		}
		super.push(x);
	}
	public Integer pop()
	{
		int x=super.pop();
		if (x==min())
		{
			s2.pop();
		}
		return x;
	}
	public int min()
	{
		if(s2.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return s2.peek();
		}
	}

}
