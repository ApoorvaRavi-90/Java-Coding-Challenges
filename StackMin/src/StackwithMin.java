import java.util.Stack;


public class StackwithMin extends Stack<NodewithMin>
{
	public void push(int value)
	{
		int newMin=Math.min(value, min());
		super.push(new NodewithMin(value,newMin));
		
	}

	public int min()
	{
		if (this.isEmpty())
		{
			return Integer.MAX_VALUE;
			
		}
		else
		{
			return peek().min;
		}
	
	}
}
