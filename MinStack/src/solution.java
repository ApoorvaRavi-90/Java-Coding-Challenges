import java.util.*;

public class solution extends Stack<Integer>
{
	Stack<Integer> s2=new Stack<Integer>();
   public void push(int a)
   {
	   if (a<=min())
	   {
		   s2.push(a);
	   }
	   super.push(a);
   }
   public Integer pop()
   {
	   int x= super.pop();
	   if(x==min())
	   {
		   s2.pop();
	   }
	   return x;
   }
   public int min()
   {
	   if(!s2.isEmpty())
		   {
		   return s2.peek();
		   }
	   else
	   {
		   return Integer.MAX_VALUE;
	   }
	   
   }
	public static void main(String[] args) 
	{
		

	}

}
