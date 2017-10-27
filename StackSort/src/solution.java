import java.util.*;
public class solution {
	void sort(Stack<Integer> s)
	{
		Stack<Integer> r=new Stack<Integer>();
		while(!s.isEmpty())
		{
			int tmp=s.pop();
			while(r.peek()>tmp)
			{
				s.push(r.pop());
			}
			r.push(tmp);
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
