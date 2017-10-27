import java.util.Stack;

public class SortStack 
{
	void sort(Stack<Integer> s)
	{
		Stack<Integer> r =new Stack<Integer>();
		while (!s.isEmpty())
		{
			int temp= s.pop();
			while (!r.isEmpty() && r.peek() >temp)
			{
				s.push(r.pop());
			}
			r.push(temp);
		}
		while(!r.isEmpty())
		{
			s.push(r.pop());
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
