import java.util.*;
public class SetStack {
	ArrayList<Stack> stacks= new ArrayList<Stack>();
	public int capacity;
	public SetStack(int c)
	{
		capacity=c;
	}
	public Stack getLastStack()
	{
		if(stacks.size()==0)
		{
			return null;
					}
		return stacks.get(stacks.size()-1);
	}
	public void push(int v)
	{
		Stack last= getLastStack();
		if(last!=null && !last.isFull())
		{
			last.push(v);
		}
		else
		{
			Stack stack=new Stack(capacity);
			stack.push(v);
			stacks.add(stack);
			
		}
	}
	public int pop()
	{
		Stack last= getLastStack();
		if (last==null)
				{
			throw new EmptyStackException();
				}
		int x=last.pop();
		if (last.size()==0)
		{
			stacks.remove(stacks.size()-1);
		}
		return v;
	}
	public boolean isEmpty()
	{
		Stack last= getLastStack();
		return last==null||last.isEmpty();
		
	}
	public int popAt(int index)
	{
		return leftShift(index,true);
	}
	public int leftShift(int index, boolean removeTop)
	{
		Stack stack= stacks.get(index);
		int removed_item;
		if(removeTop)
		{
			removed_item= stack.pop();
		}
		else
		{
			removed_item=stack.removeBottom();
		}
		if (stack.isEmpty())
		{
			stack.remove(index);
		}
		else if(stack.size()>index+1)
		{
			int v= leftShift(index+1,false);
			stack.push(v);
		}
		return removed_item;
	}
	

}
