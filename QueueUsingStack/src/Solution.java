import java.util.*;

public class Solution {
	public class MyQueue<T>
	{
		private Stack<T> stackNewestFirst=new Stack<T>();
		private Stack<T> stackOldestFirst =new Stack<T>();
		
		public void enqueue(T value)
		{
			stackNewestFirst.push(value);
		}
		public T peek()
		{
			shiftStack();
			return stackOldestFirst.peek();
		}
		public T dequeue()
		{
			shiftStack();
			return stackOldestFirst.pop();
		}
		public void shiftStack()
		{
			if (stackOldestFirst.isEmpty())
			{
				while (!stackNewestFirst.isEmpty())
				{
					stackOldestFirst.push(stackNewestFirst.pop());
				}
			}
		}
		
	}

}
