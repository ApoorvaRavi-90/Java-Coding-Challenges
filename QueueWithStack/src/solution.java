import java.util.*;
public class solution<T>{
	Stack<T> stackOldest , stackNewest;
	public solution()
	{
		Stack<T> stackOldest = new Stack<T>();
		Stack<T> stackNewest = new Stack<T>();
	}
	public int size()
	{
		return stackOldest.size()+stackNewest.size();
	}


public void add(T value)
{
	stackNewest.push(value);
}
void shiftstack()
{
	if(stackOldest.isEmpty())
	{
		while(!stackNewest.isEmpty())
		{
			stackOldest.push(stackNewest.pop());
		}
	}
}
public T pop()
{
	shiftstack();
	return stackOldest.pop();
	
}
public T peek()
{
	shiftstack();
	return stackOldest.peek();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
